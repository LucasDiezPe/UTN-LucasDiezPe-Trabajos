package Ejercicio_1;

public class E1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] numeros = {1,2,3,4,5,6,10};
int x=4;
int suma=0;
for(int i=0;i<numeros.length;i++) {
	if(numeros[i]>x) {suma =suma+numeros[i];
	}
}
System.out.println("la suma de los numeros mayores a 'x' es : "+ suma);
	}

}
