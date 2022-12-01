package com.mygdx.game;

import java.util.Random;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class MultiLadrillo {
	
	private final int x;
	private final int y;
	private final int width;
	private final int height;
	private final Color cc;
	private final Random r;
	private  int vidas;
	private boolean destroyed;
	
	public MultiLadrillo(int x, int y, int width, int height, Color cc, Random r2, int vidas, boolean destroyed) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.cc = cc;
		this.r = r2;
		this.vidas = vidas;
		this.destroyed = destroyed;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getCc() {
		return cc;
	}

	public Random getR() {
		return r;
	}

	public int getVidas() {
		return vidas;
	}

	public boolean isDestroyed() {
		return destroyed;
	}
	
	public void draw(ShapeRenderer shape){
    	shape.setColor(cc);
        shape.rect(x, y, width, height);
    }
	
	public void quitarVida() {
		this.vidas=vidas-1;
		
	}
	
	public void killLadrillo() {
		this.destroyed=true;
	}

	

}
