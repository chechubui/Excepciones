package diapositivas;


import java.io.IOException;
import java.io.RandomAccessFile;

public class AccesoAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definimos el dichero de acceso aleatorio
		//usando jdk 1.7 no hace falta cerrar el flujo
		try (RandomAccessFile fichero = new RandomAccessFile("C:/Users/ma�ana/Desktop/IO/random.dat", "rw");) {
			System.out.println("Puntero del archivo inicialmente en: "+fichero.getFilePointer());
			long tama�oInicialFichero = fichero.length();
			//muavo el puntero
			fichero.seek(tama�oInicialFichero);
			
			for (int i = 0; i < 100; i++) {
				fichero.write(i);
			}
			System.out.println("Tama�o del archivo: "+fichero.length());
			System.out.println("Puntero del archivo en: "+fichero.getFilePointer());
			//cambiamos la posicion del puntero
			fichero.seek(0);
			System.out.println("valor en esa posciion: "+fichero.readInt());
			fichero.seek(8);
			fichero.writeInt(12);
			fichero.seek(8);
			System.out.println("valor en esa posciion: "+fichero.readInt());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
