package Topicos.par;

public class juego {
	int juego [] = {5,6,7,3,8,9,9,7,9,7};	
	
	public int puntaje() {
	     int total = 0;
       // sumar el valor de cada elemento al total
       for (int contador = 0; contador < juego.length; contador++) {
           total += juego[contador];
        }
       return total;
	

}
}
