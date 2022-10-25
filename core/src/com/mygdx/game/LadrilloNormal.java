package com.mygdx.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Random;

import com.badlogic.gdx.graphics.Color;

public class LadrilloNormal extends Ladrillo {
	int vida=1;
   
    public LadrilloNormal(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public void draw(ShapeRenderer shape){
    	shape.setColor(cc);
        shape.rect(x, y, width, height);
    }

	@Override
	public int getVida() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setVida(int vida) {
		// TODO Auto-generated method stub
		
	}
}