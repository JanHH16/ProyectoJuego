package com.mygdx.game;

public class Player {
	
	private int vidas;
	private int puntaje;
	private int nivel;
	
	public Player(int vidas, int puntaje, int nivel) {
		super();
		this.vidas = vidas;
		this.puntaje = puntaje;
		this.nivel = nivel;
	}

	public int getVidas() {
		return vidas;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public int getNivel() {
		return nivel;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	

}
