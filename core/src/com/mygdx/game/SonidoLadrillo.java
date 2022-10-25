package com.mygdx.game;

import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SonidoLadrillo implements Sonido  {
	
	Clip clip;
	URL soundURL[] = new URL[2];
	
	public SonidoLadrillo() {
		
		soundURL[0]=getClass().getResource("/Ping sound effects.wav");
		
	}

	@Override
	public void suenaladrillo() {
		// TODO Auto-generated method stub
		clip.start();
	}

	@Override
	public void suenatabla() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fijarSonido() throws UnsupportedAudioFileException, LineUnavailableException {
		try {
			AudioInputStream m = AudioSystem.getAudioInputStream(soundURL[0]);
			this.clip = AudioSystem.getClip();
			clip.open(m);
		}catch(Exception e){}

    }

}
