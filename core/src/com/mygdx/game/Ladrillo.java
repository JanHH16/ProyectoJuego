package com.mygdx.game;

import java.util.Random;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Ladrillo {

	int x,y,width,height;
	Color cc;
	boolean destroyed;
	    
	public Ladrillo(int x, int y, int width, int height) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	        destroyed = false;
	        Random r = new Random(x+y);
	        
	        cc = new Color(0.1f+r.nextFloat(1), r.nextFloat(1), r.nextFloat(1), 10);	  
	    }
	    
	    public abstract void draw(ShapeRenderer shape);
	    
	    public abstract int getVida();

		public abstract void setVida(int vida);
	    
}