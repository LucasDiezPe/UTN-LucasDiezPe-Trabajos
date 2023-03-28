package Ejercicio_2;

public class E2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String abecedario="abcdefghijklmnñopqrstuvwxyz";
String frase="hola";

int desplazamiento=1;

System.out.println("Esta es la  palabra  original: "+frase);
for(int i=0;i<frase.length();i++) {
	char letra=frase.charAt(i);
	for(int a=0;a<abecedario.length();a++) {
		if ((letra==abecedario.charAt(a)&&((a+desplazamiento)<27))) {frase=frase.replace(letra,abecedario.charAt(a+desplazamiento));
	}
}
	
}System.out.println("Esta es la palabra codificada con 1 desplazamiento: "+frase);}}
