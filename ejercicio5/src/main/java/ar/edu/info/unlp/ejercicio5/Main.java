package ar.edu.info.unlp.ejercicio5;

public class Main {
	public static void main(String[] args) {
		Media cancion = new Audio();
		Media cancion2 = new Audio();
		Media cancion3 = new Audio();
		Media stream = new VideoStreamAdapter(); 
		MediaPlayer mediaplayer = new MediaPlayer(cancion); 
		mediaplayer.addMedia(cancion2);
		mediaplayer.addMedia(cancion3);
		mediaplayer.addMedia(stream);
		mediaplayer.play();				
	}

}
