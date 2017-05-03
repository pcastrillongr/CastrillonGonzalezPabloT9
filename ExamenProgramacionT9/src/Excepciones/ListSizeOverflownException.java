package Excepciones;

//excepcion creada para cuando la lista se pase de su tamaño maximo

public class ListSizeOverflownException extends RuntimeException {
	
	
	public  ListSizeOverflownException(String msg){
		
		super("EXCEPTION:"+msg);
		
		
	}

}
