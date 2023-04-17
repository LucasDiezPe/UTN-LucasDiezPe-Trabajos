package EjercicioClase_4;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class E3A {

	public static void main(String[] args, String String) {
		// TODO Auto-generated method stub
int desplazamiento=1;
String TipoOp="codificar";
String PathE="C:\\Users\\Usuario\\Documents\\GitHub\\UTN-LucasDiezPe-Trabajos\\frase.txt";
String PathS="C:\\Users\\Usuario\\Documents\\GitHub\\UTN-LucasDiezPe-Trabajos\\fraseCodificada.txt";
Codificador(String PathE, String PathS, desplazamiento)
	}

public static void Codificador(String PathE,String PathS, int desplazamiento) {
List<String> frase=Files.readAllLines(Paths.get(PathE));
String abecedario="abcdefghijklmnñopqrstuvwxyz";




System.out.println("Esta es la  palabra  original: "+frase);
for(int i=0;i<frase.length();i++) {
	char letra=frase.charAt(i);
	for(int a=0;a<abecedario.length();a++) {
		if ((letra==abecedario.charAt(a)&&((a+desplazamiento)<27))) {frase=frase.replace(letra,abecedario.charAt(a+desplazamiento));
	}
}
	
}System.out.println("Esta es la palabra codificada con 1 desplazamiento: "+frase);}
}

