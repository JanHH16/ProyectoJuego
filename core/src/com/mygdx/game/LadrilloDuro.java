package com.mygdx.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class LadrilloDuro extends Ladrillo {
	
	private int vida=2;
	
	public LadrilloDuro(int x, int y, int blockWidth, int blockHeight) {
		super(x, y, blockWidth, blockHeight);
		// TODO Auto-generated constructor stub
	}

	public void draw(ShapeRenderer shape){
    	shape.setColor(cc);
        shape.rect(x, y, width, height);
    }

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
}