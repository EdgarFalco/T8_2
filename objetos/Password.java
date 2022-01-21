package objetos;

import java.util.Random;

public class Password {

	//Atributos
	private int longitud = 8;
	private String pass;	
	
	//Construcores
	public Password() {		
	}

	public Password(int longitud) {		
		this.longitud = longitud;		
	}
	
	//Metodos
	public String generarPass() {
		//Generará la contraseña con esta lista de caracteres
		final char[] caracteres =
	        {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
	                'Q','R','S','T','U','V','W','X', 'Y','Z',
	                'a','b','c','d','e','f','g','e','h','i','j','l','k','m',
	                'n','o','p','r','s','t','u','v','w','x','y','z',
	                '1','2','3','4','5','6','7','8','9','0',
	                '@','#','!','$','€','&','[',']'};
		
		String passTemporal ="";
		Random aleatorio = new Random();
		
		//Por cada iteracion añadimos un caracter aleatorio de la lista.
		for (int i = 0; i < this.longitud; i++) {
			passTemporal += caracteres[aleatorio.nextInt(caracteres.length)];
		}		
		
		return passTemporal;
	}
	
	//Getters and Setters	

	public void setPass(String pass) {
		this.pass = pass;
	}	

	//ToString
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", pass=" + pass + "]";
	}	
}
