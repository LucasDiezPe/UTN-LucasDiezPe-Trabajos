package EjercicioClase_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class E2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String TipoOp="suma";
String Path="C:\\Users\\Usuario\\Documents\\GitHub\\UTN-LucasDiezPe-Trabajos\\numeros.txt";

LeerArchivos(Path, TipoOp);

	}

	private static void LeerArchivos(String Path, String TipoOp) {
		int suma=0;
		int multi=1;
		String ArrayNum[]= new String[10];
		
		
		try {
			for ( String linea:Files.readAllLines(Paths.get(Path))) {
				ArrayNum= linea.split(",");
			}
			for(int i=0;i<ArrayNum.length;i++) {
		if(TipoOp == "suma") {
			suma +=Integer.parseInt(ArrayNum[i]);
		}else {
			multi*=Integer.parseInt(ArrayNum[i]);
		}	
			}
			if(TipoOp == "suma") {
				System.out.println("La suma de los numeros del archivo es: "+suma);
			}else {
				System.out.println("La multiplicación de los numeros del archivo es: "+multi);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
