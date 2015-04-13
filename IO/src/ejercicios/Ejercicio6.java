//el ejercicio nos particiona un archivo en dos partes donde hacemos dos ficheros
package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6 {
	public static void main(String[] args) {
		String path= "C:/Users/ma�ana/Desktop/Ejer_IO/ejercicio6_7/";
		File inFile = new File(path+"Cadena.java");
		//dos ficheros de salida
		File outFile1 = new File(path+"Cadena1.java");
		File outFile2 = new File(path+"Cadena2.java");
		//creamos un array  de 1024 bytes de tipo char
		char[] parte1 = new char[1024];//a�adimos la primera parde del fichero
		//tama�o del segundo array es el tama�o del fichero menos el tama�o del primer array
		char[] parte2 = new char[(int) (inFile.length()-parte1.length)];
		//stream de lectura y escritura
		try (BufferedReader in = new BufferedReader(
				new FileReader(inFile));
				BufferedWriter out1 = new  BufferedWriter(
						new FileWriter(outFile1));
							BufferedWriter out2 = new BufferedWriter(
									new FileWriter(outFile2))) {
			//a�adir los primeros 1024 bytes al array
			in.read(parte1);
			//el resto lo a�adimos al segundo array
			//in.read(parte2); no funciona a�ade desde el byte 0 hasta el tama�o del array2
			in.read(parte2);
			//escribimos en el fichero de salida 1
			out1.write(parte1); out1.flush();
			out2.write(parte2); out2.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
