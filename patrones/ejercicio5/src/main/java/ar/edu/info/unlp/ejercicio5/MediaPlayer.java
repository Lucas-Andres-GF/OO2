package ar.edu.info.unlp.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	private List<Media> medias; 
	
	public MediaPlayer() {
		this.medias = new ArrayList<Media>();
	}
	
	public MediaPlayer(Media media) {
		this.medias = new ArrayList<Media>();
		addMedia(media);
	}
	
	public void addMedia(Media media) {
		 medias.add(media); 
	}
	
	public void play(){
		if (medias != null) {
			medias.forEach(m -> m.play());
		}
			
	}
	
}
