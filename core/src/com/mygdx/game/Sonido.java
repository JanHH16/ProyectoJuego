package com.mygdx.game;



import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public interface Sonido {
	
	void suenaladrillo();
	void fijarSonido() throws UnsupportedAudioFileException, LineUnavailableException;

}
