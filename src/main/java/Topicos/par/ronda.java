package Topicos.par;

public class ronda {
	int ronda [] = {3 , 5};
	
	
	public int sumar() {
		     int total = 0;
	        // sumar el valor de cada elemento al total
	        for (int contador = 0; contador < ronda.length; contador++) {
	            total += ronda[contador];
	         }
	        return total;

}
}
