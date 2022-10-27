package com.mygdx.game;

import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


public class BlockBreakerGame extends ApplicationAdapter {
    private OrthographicCamera camera;
	private SpriteBatch batch;	   
	private BitmapFont font;
	private ShapeRenderer shape;
	private PingBall ball;
	private Paddle pad;
	private ArrayList<Ladrillo> blocks = new ArrayList<Ladrillo>();
	private Player jugador = new Player(3,0,1);
    
		@Override
		public void create () {	
			camera = new OrthographicCamera();
		    camera.setToOrtho(false, 800, 480);
		    batch = new SpriteBatch();
		    font = new BitmapFont();
		    font.getData().setScale(3, 2);
		    crearBloques(2+jugador.getNivel());  
		    shape = new ShapeRenderer();
		    ball = new PingBall(Gdx.graphics.getWidth()/2-10, 41, 10, 5, 7, true);
		    pad = new Paddle(Gdx.graphics.getWidth()/2-50,40,100,10);
		     
		}
		public void crearBloques(int filas) {
			
			
			blocks.clear();
			int blockWidth = 70;
		    int blockHeight = 26;
		    int y = Gdx.graphics.getHeight();
		    for (int cont = 0; cont<filas; cont++ ) {
		    	y -= blockHeight+10;
		    	for (int x = 5; x < Gdx.graphics.getWidth(); x += blockWidth + 10) {
		    		
		    		if (jugador.getNivel()==1) {
		    			blocks.add(new LadrilloNormal(x, y, blockWidth, blockHeight));
		    		}
		    		
		    		if (jugador.getNivel()==2) {
		    			
		    			if(cont%2 == 0) {
		    				
		    				blocks.add(new LadrilloDuro(x,y,blockWidth,blockHeight));
		    			}else {
		    				
		    				blocks.add(new LadrilloNormal(x, y, blockWidth, blockHeight));
		    			}
		    			
		    		}
		    		
		            
		        }
		    }
		}
		public void dibujaTextos() {
			//actualizar matrices de la cámara
			camera.update();
			//actualizar 
			batch.setProjectionMatrix(camera.combined);
			batch.begin();
			//dibujar textos
			font.draw(batch, "Puntos: " + jugador.getPuntaje(), 10, 25);
			font.draw(batch, "Vidas : " + jugador.getVidas(), Gdx.graphics.getWidth()-20, 25);
			batch.end();
		}	
		public PingBall crearpelota() {
			PingBall pelota = new PingBall(pad.getX()+pad.getWidth()/2-5, pad.getY()+pad.getHeight()+11, 10, 5, 7, true); 
			return pelota;
		}
		@Override
		public void render () {
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); 		
	        shape.begin(ShapeRenderer.ShapeType.Filled);
	        pad.draw(shape);
	      
	        condiciones();
	        
	        bloquesUpdate();
	        
	        
	        dibujaTextos();
		}
		
		@Override
		public void dispose () {

		}
		public void bloquesUpdate() {
			
			//dibujar bloques
	        for (Ladrillo b : blocks) {        	
	            b.draw(shape);
	            try {
					ball.checkCollision(b);
				} catch (UnsupportedAudioFileException | LineUnavailableException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        // actualizar estado de los bloques 
	        for (int i = 0; i < blocks.size(); i++) {
	            Ladrillo b = blocks.get(i);
	            if (b.destroyed) {
	            	jugador.setPuntaje(jugador.getPuntaje()+1);
	            	blocks.remove(b);
	                i--; //para no saltarse 1 tras eliminar del arraylist
	            }
	        }
	        
	        try {
				ball.checkCollision(pad);
			} catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        ball.draw(shape);
	        
	        shape.end();
			
		} 
		public void condiciones(){

			  // monitorear inicio del juego
		        if (ball.estaQuieto()) {
		        	ball.setXY(pad.getX()+pad.getWidth()/2-5, pad.getY()+pad.getHeight()+11);
		        	if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) ball.setEstaQuieto(false);
		        }else ball.update();
		        //verificar si se fue la bola x abajo
		        if (ball.getY()<0) {
		        	jugador.setVidas(jugador.getVidas()-1);
		        
		        	ball = crearpelota();
		        }
		        // verificar game over
		        if (jugador.getVidas()<=0) {
		        	jugador.setVidas(3);
		        	jugador.setNivel(1);
		        	crearBloques(2+jugador.getNivel());
		        		        	
		        }
		        // verificar si el nivel se terminó
		        if (blocks.size()==0) {
		        	jugador.setNivel(jugador.getNivel()+1);
		        	crearBloques(2+jugador.getNivel());
		        	ball = crearpelota();
		        }
			 
		 }
	}