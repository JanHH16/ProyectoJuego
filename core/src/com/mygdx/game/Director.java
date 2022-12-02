package com.mygdx.game;

import java.util.Random;

import com.badlogic.gdx.graphics.Color;

public class Director {
	
	public Director() {};
	
	public  MultiLadrillo LadrilloUnaVida(ConstructorLadrillos ladrillo, int x, int y,int blockHeight, int blockWidth, Random r,int vidas){
		
				
		ladrillo.setX(x);
		ladrillo.setY(y);
		ladrillo.setHeight(blockHeight);
		ladrillo.setWidth(blockWidth);
		ladrillo.set_Destroyed(false);
		r = new Random(x+y);
		ladrillo.set_r(r);
		ladrillo.set_cc(new Color(0.1f+r.nextFloat(1), r.nextFloat(1), r.nextFloat(1), 10));
		ladrillo.setVidas(vidas);
		
		return ladrillo.retorna_ladrillo(); 
	
	}
	
	public  MultiLadrillo LadrilloDosVida(ConstructorLadrillos ladrillo, int x, int y,int blockHeight, int blockWidth, Random r,int vidas){
		
		
		ladrillo.setX(x);
		ladrillo.setY(y);
		ladrillo.setHeight(blockHeight);
		ladrillo.setWidth(blockWidth);
		ladrillo.set_Destroyed(false);
		r = new Random(x+y);
		ladrillo.set_r(r);
		ladrillo.set_cc(new Color(0.1f+r.nextFloat(1), r.nextFloat(1), r.nextFloat(1), 10));
		ladrillo.setVidas(vidas);
		
		return ladrillo.retorna_ladrillo(); 
	
	}
	

		


}
