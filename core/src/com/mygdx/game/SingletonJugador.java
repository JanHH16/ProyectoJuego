package com.mygdx.game;

public class SingletonJugador {
	
	private static SingletonJugador instance;
	
	private int vidas;
	private int puntaje;
	private int nivel;
	
	
	private SingletonJugador(int vidas, int puntaje, int nivel) {
		
		this.vidas = vidas;
		this.puntaje = puntaje;
		this.nivel = nivel;
	}
	
	public static SingletonJugador getinstancia(int vidas, int puntaje, int nivel) {
		
		if (instance == null) {
			
			instance = new SingletonJugador(vidas,puntaje,nivel);
		}
		
		return instance; 
		
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
