package Excepciones;

//excepcion creada para cuando la lista se pase de su tama�o maximo

public class ListSizeOverflownException extends RuntimeException {
	
	
	public  ListSizeOverflownException(String msg){
		
		super("EXCEPTION:"+msg);
		
		
	}

}
