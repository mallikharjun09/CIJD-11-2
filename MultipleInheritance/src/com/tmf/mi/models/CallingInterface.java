package com.tmf.mi.models;

public class CallingInterface {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.add(0, 0);
		m.call();
		m.playSong();
		
		MP3Player player = new Mobile();
		player.displayTrack();
		player.playSong();
		player.resumeSong();
		
		Calculator calc = new Mobile();
		calc.add(15, 20);
		calc.diff(0, 0);
		
		SciCalc calc2 = new Mobile();
		calc2.add(0, 0);
		calc2.log(0);
	}
}
