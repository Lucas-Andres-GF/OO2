package Ejercicio1;

public class main {

	public static void main(String[] args) {
		
		Twitter twitter = new Twitter();
		
		Usuario franco = twitter.darDeAltaUsuario("FRANCO");
		Usuario lucas = twitter.darDeAltaUsuario("MELMAN");
		
		Tweet t1 = franco.twittear("AGUANTE LA JODA");
		Tweet t2 =lucas.twittear("AGUANTE EL LOL");
		
		ReTweet rt1 = franco.reTwittear(t2);
		ReTweet rt2 = lucas.reTwittear(t1);
		
		ReTweet rtrt = franco.reTwittear(rt2);
		
		for (int i=0; i<3; i++) {
			System.out.println(franco.elementos.get(i).toString()); 
		}
		
		twitter.eliminarUsuario(lucas);
	
		
		for (int i=0; i<franco.elementos.size(); i++) {
			System.out.println(franco.elementos.get(i).toString()); 
		}
	}

}
