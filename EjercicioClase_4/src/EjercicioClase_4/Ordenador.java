package EjercicioClase_4;

public class Ordenador {
	Ordenador(int a,int b,int c,String orden){
		
		int mayor=0, medio=0, menor=0;
		
		String asc="a";
		String des="d";
		
		if((a>b)&&(a>c)) {mayor=a;}
		else if ((b>a)&&(b>c)){mayor=b;}
		else if ((c>a)&&(c>b)){mayor=c;}
		
		if((a<b)&&(a<c)) {menor=a;}
		else if ((b<a)&&(b<c)){menor=b;}
		else if ((c<a)&&(c<b)){menor=c;}
		
		if(((b>a)&&(c<a)||((b<a)&&(c>a)))) {medio=a;}
		else if (((a>b)&&(c<b)||((a<b)&&(c>b)))){medio=b;}
		else if (((b>c)&&(a<c)||((b<c)&&(a>c)))) {medio=c;}
		
		String descendente="el orden descendete es:" +mayor+" "+medio+" "+menor;
		String ascendente="el orden ascendete es:" +menor+" "+medio+" "+mayor;
		
		if (orden.equals(asc)) {System.out.println(ascendente);}
		else if(orden.equals(des)) {System.out.println(descendente);}
		else System.out.println("el valor del parametro orden es incorrecto");
		
		
	}
}
