package Integrador;

public class PartidoJugado {
	
	public PartidoJugado() {}
		String Eq1, Eq2;
		public String getEq1() {
			return Eq1;
		}
		public String getEq2() {
			return Eq2;
		}
		public void setEq1(String eq1) {
			Eq1 = eq1;
		}
		public void setEq2(String eq2) {
			Eq2 = eq2;
		}
		int golesEq1, golesEq2;
		String nroRonda,nroPartido;
		String resultadoEq1,resultadoEq2;
			public String resultadosEq1() {
				if(golesEq1==golesEq2){
					resultadoEq1 ="EMPATADOs";} 
				else if (golesEq1>golesEq2){
					resultadoEq1 = "GANADOR";}
				else if (golesEq1<golesEq2){
					resultadoEq1 ="PERDEDOR";
				}return resultadoEq1;
				}	
			public String resultadosEq2() {
				if(golesEq1==golesEq2){
					resultadoEq2 = "EMPATADOS";} 
				else if (golesEq1>golesEq2){
					resultadoEq2 = "PERDEDOR";}
				else if (golesEq1<golesEq2){
					resultadoEq2 ="GANADOR";
				}return resultadoEq2;
				}		
/*public Enum<?> getResultadoEq1() {
	this.resultadoEq1
			return resultadoEq1;
		}
		public void setResultadoEq1(Enum<?> resultadoEq1) {
			/*if(golesEq1==golesEq2){
			resultadoEq1 = listaResultados.EMPATADO;} 
		else if (golesEq1>golesEq2){
			resultadoEq1 = listaResultados.GANADOR;}
		else if (golesEq1<golesEq2){
			resultadoEq1 = listaResultados.PERDEDOR;}
		}*/public String getResultadoEq1() {
			
			return resultadoEq1;
		}
		public void setResultadoEq1(String resultadoEq1) {
			this.resultadoEq1 = resultadoEq1;
		}
		public String getResultadoEq2() {
			return resultadoEq2;
		}
		public void setResultadoEq2(String resultadoEq2) {
			this.resultadoEq2 = resultadoEq2;
		}
		
		/*public Enum<?> getResultadoEq2() {
			return resultadoEq2;
		}
		public void setResultadoEq2(Enum<?> resultadoEq2) {
			/*if(golesEq1==golesEq2) {
				resultadoEq2 = listaResultados.EMPATADO;
			} else if (golesEq1>golesEq2){
				resultadoEq2 = listaResultados.PERDEDOR;
			} else if (golesEq1<golesEq2){
				resultadoEq2 = listaResultados.GANADOR;}*/

public String getNroRonda() {
	return nroRonda;
}
public void setNroRonda(String nroRonda) {
	this.nroRonda = nroRonda;
}
public String getNroPartido() {
	return nroPartido;
}
public void setNroPartido(String nroPartido) {
	this.nroPartido = nroPartido;
}
public int getGolesEq1() {
	return golesEq1;
}
public void setGolesEq1(int golesEq1) {
	this.golesEq1 = golesEq1;
}
public int getGolesEq2() {
	return golesEq2;
}
public void setGolesEq2(int golesEq2) {
	this.golesEq2 = golesEq2;
}
	
	}

