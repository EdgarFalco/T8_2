import objetos.*;

public class Ejercicio2App {

	public static void main(String[] args) {
		//Creamos un objeto con el valor de pass por defecto y el valor de la longitud que epecifiquemos
		Password pass1 = new Password(20);
		//Cambiamos el valor del atributo pass y le establecemos una contraseña			
		pass1.setPass(pass1.generarPass());
		//Mostramos el objeto password con la contraseña establecida
		System.out.println(pass1.toString());
	}
}
