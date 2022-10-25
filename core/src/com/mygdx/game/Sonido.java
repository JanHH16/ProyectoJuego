package com.mygdx.game;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public interface Sonido {
	
	void suenaladrillo();
	void suenatabla() throws UnsupportedAudioFileException, IOException, LineUnavailableException;
	
	void fijarSonido() throws UnsupportedAudioFileException, LineUnavailableException;

}
