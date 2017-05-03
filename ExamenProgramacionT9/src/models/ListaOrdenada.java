package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import Excepciones.ElementNotAllowedException;
import Excepciones.ListSizeOverflownException;

public class ListaOrdenada<T> extends ArrayList<T> {

	private Comparator<T> comparador;
	int max_size = 100;

	//Constructor al que le pasamos un comparador
	
	public ListaOrdenada(Comparator<T> comparador) {

		super();
		this.comparador = comparador;
	}

	@Override

	//Metodo creado para añadir elementos ,no dejara introducir null ni pasarse de 101
	
	public boolean add(T element) throws ListSizeOverflownException, ElementNotAllowedException {

		if (element != null) {

			if (super.size() < max_size) {

				boolean estado = super.add(element);
				super.sort(this.comparador);
				return estado;

			} else {
				throw new ListSizeOverflownException("Cola LLena");
			}

		} else {

			throw new ElementNotAllowedException("No se aceptan nulos");
		}
	}

	//creamos un iterator, con la longitud de nuestra collecion y mientras tengo uno previo nos lo mostrara al reves
	


	public void reverse (Collection<? extends T> coll){
		
		ListIterator<T> iterator =((ArrayList<T>) coll).listIterator(coll.size());
		while(iterator.hasPrevious()){
			
			System.out.println(iterator.previous());
		}
				
		

	}
	
	//Hayamos el minimo con el collection.min y lo devolvemos
	
	public  T min(){
		
		T minimo;
		minimo= Collections.min(this,comparador);
		return minimo;
	}
	
	//Hayamos el maximo con el collection.max y lo devolvemos
	
	public T max(){
		
		T max;
		max=Collections.max(this,comparador);
		return max;
	}

	
			
			
			
			
		
}
