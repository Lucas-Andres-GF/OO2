package ar.edu.info.unlp.ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		Twitter twitter = new Twitter();
		
		Usuario lucas = twitter.agregarUsuario("Lucas");
		Usuario pepe = twitter.agregarUsuario("Lucas");
		Usuario juan = twitter.agregarUsuario("Juan");
		
		Tweet tweet1 = lucas.twittear("Hoy es un buen dia");
		Tweet tweet2 = juan.twittear("Rock & roll y fiebre");
		
		Retweet retweetLucas = lucas.reTwittear(tweet2);
		Retweet retweetJuan = juan.reTwittear(tweet1);
		
		Retweet rtDelrtDeJuan = lucas.reTwittear(retweetJuan); 
		Retweet rtDeTweetDeLucas = lucas.reTwittear(tweet1); 
		Retweet rtDeRtDELucasdeRtdeJuan = lucas.reTwittear(rtDelrtDeJuan); 
		
//		System.out.println(lucas.verPublicaciones());
		
		twitter.eliminarUsuario(juan); 
		
		System.out.println(juan.cantidadDePublicaciones()); 
		
//		System.out.println(lucas.verPublicaciones());
		
	}
}
