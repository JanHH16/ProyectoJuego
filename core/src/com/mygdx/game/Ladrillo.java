package com.mygdx.game;

import java.util.Random;

public class Ladrillo implements ClaseLadrillo {
	
	private Director director = new Director(); 
	private ConstructorLadrillos b = new ConstructorLadrillos();

	@Override
	public MultiLadrillo clase1(int x, int y, int blockHeight, int blockWidth, Random r) {
		director.LadrilloDosVida(b, x, y, blockHeight, blockWidth, r, 1);
		MultiLadrillo a = b.retorna_ladrillo();
		return a;	
	}

	@Override
	public MultiLadrillo clase2(int x, int y, int blockHeight, int blockWidth, Random r) {
		director.LadrilloDosVida(b, x, y, blockHeight, blockWidth, r, 2);
		MultiLadrillo a = b.retorna_ladrillo();
		return a;	
	}

}
