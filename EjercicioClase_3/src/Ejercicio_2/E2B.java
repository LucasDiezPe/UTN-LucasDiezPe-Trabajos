package Ejercicio_2;

public class E2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String abecedario="abcdefghijklmnñopqrstuvwxyz";
String frase="hola que tal";

int desplazamiento=2;

System.out.println("'"+frase+"' es la frase original");
for(int i=0;i<frase.length();i++) {
	char letra=frase.charAt(i);
	for(int a=0;a<abecedario.length();a++) {
		if ((letra==abecedario.charAt(a)&&((a+desplazamiento)<27))) {frase=frase.replace(letra,abecedario.charAt(a+desplazamiento));
	}
}
	
	}
System.out.println("'"+frase+"' es la frase codificada con dos desplazamientos");
}}
