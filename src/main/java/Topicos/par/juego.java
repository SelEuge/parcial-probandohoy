package Topicos.par;

public class juego {
	int [] [] juego = {{2,3},{4,2},{3,4},{2,1},{3,5},{5,4},{5,4},{6,3},{4,3},{4,5}};
			
	
		public int puntaje() { 
			int puntaje = 0; 
			int [] [] matriz = {{2,3},{4,2},{3,4},{2,1},{3,5},{5,4},{5,4},{6,3},{4,3},{4,5}};
			for (int fila = 0; fila < matriz.length; fila++) 
			for (int columna = 0; columna < matriz[fila].length; columna++) 
			puntaje += matriz[fila][columna]; 
		
			return puntaje; 
			}
		
		//public boolean extra(){
			//int [] [] matriz = {{2,3},{4,2},{3,4},{2,1},{3,5},{5,4},{5,4},{6,3},{4,3},{4,5},{2,2}};
			 //int  res = matriz.length;
			 //if (res> 10) 
				// return true;
			 
			    
		        //}
			
		}

		
		

	

