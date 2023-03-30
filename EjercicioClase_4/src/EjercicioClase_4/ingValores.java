package EjercicioClase_4;

public class ingValores {
	ingValores() {
	}
	int a;
	int b;
	int c;
	String orden; 
	
	
	public String getOrden() {
		return orden;
	}
	public void setOrden(String orden) {
		this.orden = orden;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c; }{

String resultado;
    if((a>b)&(a>c)&(b>c)&(this.orden=="d")){System.out.println(this.a+""+this.b+""+this.c);}
	else if((a>b)&(a>c)&(b>c)&(this.orden=="a")){System.out.println(this.c+""+this.b+""+this.a);}
	else if((a>b)&(a>c)&(c>b)&(this.orden=="d")){System.out.println(this.a+""+this.c+""+this.b);}
	else if((a>b)&(a>c)&(c>b)&(this.orden=="a")){System.out.println(this.b+""+this.c+""+this.a);}
	else if((b>a)&(b>c)&(a>c)&(this.orden=="a")){System.out.println(this.c+""+this.a+""+this.b);}
	else if((b>a)&(b>c)&(a>c)&(this.orden=="d")){System.out.println(this.b+""+this.a+""+this.c);}
	else if((b>a)&(b>c)&(c>a)&(this.orden=="d")){System.out.println(this.b+""+this.c+""+this.a);}
	else if((b>a)&(b>c)&(c>a)&(this.orden=="a")){System.out.println(this.a+""+this.c+""+this.b);}
	else if((c>a)&(c>b)&(a>b)&(this.orden=="a")){System.out.println(this.b+""+this.a+""+this.c);}
	else if((c>a)&(c>b)&(a>b)&(this.orden=="d")){System.out.println(this.c+""+this.a+""+this.b);}
	else if((c>a)&(c>b)&(b>a)&(this.orden=="d")){System.out.println(this.c+""+this.b+""+this.a);}
	else if((c>a)&(c>b)&(b>a)&(this.orden=="a")){System.out.println(this.a+""+this.b+""+this.c);}
	else {System.out.println("error en el ingreso de valores");}
	
	}
	

}
