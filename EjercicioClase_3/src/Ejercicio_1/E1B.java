package Ejercicio_1;

public class E1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Dados 3 números y un orden (ascendente o decreciente) que ordene los
mismos y los retorne en un vector de 3*/
		int a,b,c;
		int [] ascendente= new int [3];
		int [] descendente= new int [3];
		a=1;
		b=5;
		c=2;
		
		for(int i=0;i<3;i++) {
			if((a>b)&(a>c)&(b>c)){descendente[0]=a;descendente[1]=b;descendente[2]=c;
			ascendente[0]=c;ascendente[1]=b;ascendente[2]=a;}
			else if((a>b)&(a>c)&(c>b)){descendente[0]=a;descendente[1]=c;descendente[2]=b;
			ascendente[0]=b;ascendente[1]=c;ascendente[2]=a;}
			else if((b>a)&(b>c)&(a>c)){descendente[0]=b;descendente[1]=a;descendente[2]=c;
			ascendente[0]=c;ascendente[1]=a;ascendente[2]=b;}
			else if((b>a)&(b>c)&(c>a)){descendente[0]=b;descendente[1]=c;descendente[2]=a;
			ascendente[0]=a;ascendente[1]=c;ascendente[2]=b;}
			else if((c>a)&(c>b)&(a>b)){descendente[0]=c;descendente[1]=a;descendente[2]=b;
			ascendente[0]=b;ascendente[1]=a;ascendente[2]=c;}
			else if((c>a)&(c>b)&(b>a)){descendente[0]=c;descendente[1]=b;descendente[2]=a;
			ascendente[0]=a;ascendente[1]=b;ascendente[2]=c;}
			}
		System.out.println("El orden ascendente de los numeros es: "+ascendente[0]+" "+ascendente[1]+" "+ascendente[2]+" y el orden descendente :"
			+descendente[0]+" "+descendente[1]+" "+descendente[2]);
	}

}
