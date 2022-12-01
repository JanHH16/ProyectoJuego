package com.mygdx.game;



import java.util.Random;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class ConstructorLadrillos implements BuilderLadrillo {
	
	private int x;
	private int y;
	private int width;
	private int height;
	private Color cc;
	private Random r;
	private int vidas;
	private boolean destroyed;
	
	
	
	@Override
	public void setX(int i) {
		this.x=i;
		
	}
	@Override
	public void setY(int i) {
		this.y=i;
		
	}
	@Override
	public void setWidth(int i) {
		this.width=i;
		
	}
	@Override
	public void setHeight(int i) {
		this.height=i;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void set_cc(Color r) {
		this.cc=r;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void set_r(Random r2) {
		this.r=r2;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setVidas(int vidas) {
		this.vidas=vidas;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void set_Destroyed(boolean destroyed) {
		this.destroyed=false;
		// TODO Auto-generated method stub
		
	}
	
	public MultiLadrillo retorna_ladrillo() {
		
		return new MultiLadrillo(x,y,width,height,cc,r,vidas,destroyed);
	}
	
	@Override
	public void draw(ShapeRenderer shape) {
		// TODO Auto-generated method stub
		
	}
	


}
