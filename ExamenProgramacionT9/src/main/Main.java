package main;

import Excepciones.ListSizeOverflownException;
import models.ListaOrdenada;

public class Main {

	public static void main(String[] args) {


		// creamos nuestro array de int y el comparado lambda dentro de este
		
		ListaOrdenada<Integer>lista=new ListaOrdenada<Integer>(
				(Integer a, Integer b) -> b-a
				);
				
		
		
		lista.add(1);
		lista.reverse(lista);
		
		
		
		//mientras sea menor que cero insertara elementos en nuestro array list,al llegar al 101 pondra cola llena
		
	for(int i=0;i<100;i++){
		
		try{
			
			lista.add(i);
			
			
			
			
	}catch(ListSizeOverflownException e){

		System.out.println("Cola llena¡¡");
	}
		
	
		

}
	System.out.println(lista.min());
	System.out.println(lista.max());
	}
}

