package ejercicios;
/**
 * @author Jes�s Buitrago
 * 6/02/2015
 * 
 * */
public class TestClaveSegura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLmMnN��oOpPqQrRsStTuUvVwWxXyYzZ0123456789�?()=@.:,;!�&{}";
	String posibleClave="";
	//creamos un bucle infinito 
	
	while(true){
	
		//hacemos una variable que nos de un numero aleatorio que en este caso es el tama�o maximo el 
		//del FUENTE_CARACTERES
		int longitud = (int) (Math.random()*FUENTE_CARACTERES.length());
		StringBuilder sBuilder = new StringBuilder();
		
		for (int i = 0; i < longitud; i++) {
			int posicion = (int) (Math.random()*FUENTE_CARACTERES.length());
			sBuilder.append(FUENTE_CARACTERES.charAt(posicion));
		}
		//System.out.println("Nuestra clave es : " +sBuilder);
		//convertimos el StringBuilder a String
		posibleClave =sBuilder.toString();
		//imprimimos la clave
		System.out.println("Posible Clave : " +posibleClave);
		ClaveSegura cSegura = new ClaveSegura(posibleClave);
		boolean esSegura = cSegura.minimoLongitud0cho() && cSegura.tieneLetraMayuscula() 
				&& cSegura.tieneLetraMinuscula()
				&& cSegura.tieneDigito() && cSegura.notieneDigitoOLetras();
		if(esSegura)
			break;
		}
	System.out.println("Clave Segura : "+posibleClave);
	}

}
