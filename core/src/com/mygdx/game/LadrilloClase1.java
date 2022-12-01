package com.mygdx.game;

import java.util.Random;



public class LadrilloClase1 implements ClaseLadrillo {
	

	private Director director = new Director(); 
	private ConstructorLadrillos b = new ConstructorLadrillos();
	
	
	@Override
	public MultiLadrillo clase(int x, int y, int blockHeight, int blockWidth, Random r, int Vidas) {
		
		director.LadrilloDosVida(b, x, y, blockHeight, blockWidth, r, Vidas);
		MultiLadrillo a = b.retorna_ladrillo();
		return a;	  
	}
	


}
