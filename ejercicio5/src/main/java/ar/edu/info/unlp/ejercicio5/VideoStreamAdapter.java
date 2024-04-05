package ar.edu.info.unlp.ejercicio5;

public class VideoStreamAdapter implements Media {

	private VideoStream videoStream; 
	public VideoStreamAdapter() {
		videoStream = new VideoStream(); 
	}
	@Override
	public void play() {
		this.videoStream.reproduce();
	}

}
