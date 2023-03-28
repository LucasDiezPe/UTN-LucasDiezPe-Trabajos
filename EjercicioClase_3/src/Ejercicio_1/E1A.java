package Ejercicio_1;

public class E1A {

	public static void main(String[] args) {
		/*
		 * 1. Utilizando solo tipos primitivos, String (solo usar método length), vectores,
		 * iteraciones simples y condicionales, genere una clase por ejercicio que posea los
		 * siguientes métodos:
		 * 
		 * a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
		 * el String*/
	String frase = "Mi perro se llama Doha.";
	Character letra ='r';
	int cantLetra=0;
	for(int i= 0; i< frase.length();i++){
	
		if(frase.charAt(i)==letra) {cantLetra++;
	}}
	System.out.println("la letra '"+ letra +"' se encuentra repetida "+ cantLetra +" veces en la siguiente frase: ' "+ frase + "'");

}}
