package com.mygdx.game;

import java.util.Random;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public interface BuilderLadrillo {
	
	void setX(int i);
	void setY(int i);
	void setWidth(int i);
	void setHeight(int i);
	void set_cc(Color r);
	void set_r(Random i);
	void setVidas(int vidas);
	void set_Destroyed(boolean destroyed);
	public void draw(ShapeRenderer shape);
	

}
