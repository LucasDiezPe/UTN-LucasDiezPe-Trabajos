package EjercicioClase_4;

public class E1C {

	public static void main(String[] args,int a,int b,int c,String orden) {
		
	a=10;
	b=12;
	c=9;
	orden="d";
	/*
	String d="d";
	String as="a";
	
	
	    if((a>b)&&(a>c)&&(b>c)&&(orden.equalsIgnoreCase(d))){System.out.println(a+""+b+""+c);}
		else if((a>b)&&(a>c)&&(b>c)&&(orden.equalsIgnoreCase(as))){System.out.println(c+""+b+""+a);}
		else if((a>b)&&(a>c)&&(c>b)&&(orden.equalsIgnoreCase(d))){System.out.println(a+""+c+""+b);}
		else if((a>b)&&(a>c)&&(c>b)&&(orden.equalsIgnoreCase(as))){System.out.println(b+""+c+""+a);}
		else if((b>a)&&(b>c)&&(a>c)&&(orden.equalsIgnoreCase(as))){System.out.println(c+""+a+""+b);}
		else if((b>a)&&(b>c)&&(a>c)&&(orden.equalsIgnoreCase(d))){System.out.println(b+""+a+""+c);}
		else if((b>a)&&(b>c)&&(c>a)&&(orden.equalsIgnoreCase(d))){System.out.println(b+""+c+""+a);}
		else if((b>a)&&(b>c)&&(c>a)&&(orden.equalsIgnoreCase(as))){System.out.println(a+""+c+""+b);}
		else if((c>a)&&(c>b)&&(a>b)&&(orden.equalsIgnoreCase(as))){System.out.println(b+""+a+""+c);}
		else if((c>a)&&(c>b)&&(a>b)&&(orden.equalsIgnoreCase(d))){System.out.println(c+""+a+""+b);}
		else if((c>a)&&(c>b)&&(b>a)&&(orden.equalsIgnoreCase(d))){System.out.println(c+""+b+""+a);}
		else if((c>a)&&(c>b)&&(b>a)&&(orden.equalsIgnoreCase(as))){System.out.println(a+""+b+""+c);}
		else {System.out.println("error en el ingreso de valores");}
	    */
	    if((a>b)&&(a>c)&&(b>c)&&(orden=="d")){System.out.println(a+""+b+""+c);}
		else if((a>b)&&(a>c)&&(b>c)&&(orden=="a")){System.out.println(c+""+b+""+a);}
		else if((a>b)&&(a>c)&&(c>b)&&(orden=="d")){System.out.println(a+""+c+""+b);}
		else if((a>b)&&(a>c)&&(c>b)&&(orden=="a")){System.out.println(b+""+c+""+a);}
		else if((b>a)&&(b>c)&&(a>c)&&(orden=="a")){System.out.println(c+""+a+""+b);}
		else if((b>a)&&(b>c)&&(a>c)&&(orden=="d")){System.out.println(b+""+a+""+c);}
		else if((b>a)&&(b>c)&&(c>a)&&(orden=="d")){System.out.println(b+""+c+""+a);}
		else if((b>a)&&(b>c)&&(c>a)&&(orden=="a")){System.out.println(a+""+c+""+b);}
		else if((c>a)&&(c>b)&&(a>b)&&(orden=="a")){System.out.println(b+""+a+""+c);}
		else if((c>a)&&(c>b)&&(a>b)&&(orden=="d")){System.out.println(c+""+a+""+b);}
		else if((c>a)&&(c>b)&&(b>a)&&(orden=="d")){System.out.println(c+""+b+""+a);}
		else if((c>a)&&(c>b)&&(b>a)&&(orden=="a")){System.out.println(a+""+b+""+c);}
		else {System.out.println("error en el ingreso de valores");}
	}

}
