public class Dados {

	public static void main(String[] args) {
		
		System.out.println("El jugador 1 hace su lanzamiento:");
		int Aleatorio1 = (int) Math.floor(Math.random()*(6)+1);
		System.out.print("Dado 1: ");
		System.out.println(Aleatorio1);
		int Aleatorio2 = (int) Math.floor(Math.random()*(6)+1);
		System.out.print("Dado 2: ");
		System.out.println(Aleatorio2);
		System.out.println("El jugador 2 hace su lanzamiento:");
		int Aleatorio3 = (int) Math.floor(Math.random()*(6)+1);
		System.out.print("Dado 1: ");
		System.out.println(Aleatorio3);
		int Aleatorio4 = (int) Math.floor(Math.random()*(6)+1);
		System.out.print("Dado 2: ");
		System.out.println(Aleatorio4);
		
		int Suma1 = Aleatorio1 + Aleatorio2;
		int Suma2 = Aleatorio3 + Aleatorio4;
		int mayor = Math.max(Suma1, Suma2);
		System.out.println("La tirada mas alta es: " + mayor);
		
		if(Suma1 > Suma2) {
			
			System.out.println("El ganador es el jugador 1");
			
		}
		
		if(Suma2 > Suma1) {
			
			System.out.println("El ganador es el jugador 2");
			
		}
		
		if (Suma1 == Suma2) {
			
			System.out.println("Los jugadores han empatado");
			
		}
		
		double Suma = Suma1 + Suma2;
		long Media = Math.round(Suma / 4);
		System.out.print("La media de los cuatro dados es : " + Media);
		
	}

}
