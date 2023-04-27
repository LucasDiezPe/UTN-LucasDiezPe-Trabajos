package Integrador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class pronosticoApostado {
	String Eq1, Eq2;
	int golesEq1, golesEq2;
	String nroRonda,nroPartido;
	String resultadoEq1,resultadoEq2;
	String apostador;
	
	public String getEq1() {
		return Eq1;
	}
	public void setEq1(String eq1) {
		Eq1 = eq1;
	}
	public String getEq2() {
		return Eq2;
	}
	public void setEq2(String eq2) {
		Eq2 = eq2;
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
	public String getResultadoEq1() {
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
	public String getApostador() {
		return apostador;
	}
	public void setApostador(String apostador) {
		this.apostador = apostador;
	}
	public  ArrayList<pronosticoApostado> leerApuestaCSV(String archivoCSV) {
		 ArrayList<pronosticoApostado> apuestas = new ArrayList<>();
	        try {
	            Scanner scanner = new Scanner(new File(archivoCSV));
	            while (scanner.hasNextLine()) {
	                String linea = scanner.nextLine();
	                String[] campos = linea.split(";");
	               
	                /*for(int i=0;i<campos.length;i++) {
	                System.out.println(campos[i]);
	                }*/
	               
	               // int games=campos.length/6;
	                //System.out.println("hay "+games+"partidos en el archivo");
	                pronosticoApostado apuesta = new pronosticoApostado();
	                apuestas.add(apuesta);
	                
	                apuesta.setApostador(campos[0]);
	                apuesta.setNroRonda(campos[1]);
	                apuesta.setNroPartido(campos[2]);
	                apuesta.setEq1(campos[3]);
	                apuesta.setResultadoEq1(campos[4]);
	                apuesta.setGolesEq1(Integer.parseInt(campos[5]));
	                apuesta.setGolesEq2(Integer.parseInt(campos[6]));
	                apuesta.setResultadoEq2(campos[7]);
	                apuesta.setEq2(campos[8]);
	              
	                
	                
	               
	             
		                System.out.println("En el partido "+apuesta.getNroPartido()+" de la ronda : "+apuesta.getNroRonda()+" El apostador : "+apuesta.getApostador());
		                System.out.println("Aposto que el Equipo"+apuesta.getEq1()+" : "+apuesta.getResultadoEq1() +" Vs "+apuesta.getEq2()+" : "+apuesta.getResultadoEq2());
		                
		               
	            } 
	            
               
	            
	            
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        return apuestas;
	    }
}
