package Integrador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


@SuppressWarnings("unused")
public class rondaTorneo {
	
	 public  ArrayList<PartidoJugado> leerCSV(String archivoCSV) {
		 ArrayList<PartidoJugado> partidos = new ArrayList<>();
	        try {
	            Scanner scanner = new Scanner(new File(archivoCSV));
	            while (scanner.hasNextLine()) {
	                String linea = scanner.nextLine();
	                String[] campos = linea.split(";");
	               
	                PartidoJugado partido = new PartidoJugado();
	                partidos.add(partido);
	                
	                partido.setEq1(campos[2]);
	                partido.setEq2(campos[5]);;
	                partido.setNroRonda(campos[0]);
	                partido.setNroPartido(campos[1]);
	                partido.setGolesEq1(Integer.parseInt(campos[3]));
	                partido.setGolesEq2(Integer.parseInt(campos[4]));
	               
	             
		                System.out.println("En el partido "+partido.getNroPartido()+" de la ronda : "+partido.getNroRonda());
		                System.out.println(partido.getEq1()+" : "+partido.resultadosEq1() +" Vs "+partido.getEq2()+" : "+partido.resultadosEq2());
		                
		               
	            } 
	            
                
	            
	            
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        return partidos;
	    }
	 
  /*public static ArrayList<PartidoJugado> leerCSV(String archivoCSV) {
    ArrayList<PartidoJugado> partidos = new ArrayList<>();
    try {
        Scanner scanner = new Scanner(new File(archivoCSV));
        int contador = 0; // contador para cada 6 strings
        PartidoJugado partido = null; // objeto partido
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] campos = linea.split(";");
            for (int i = 0; i < campos.length; i++) {
                System.out.println(campos[i]);
            }
            // crear un nuevo objeto partido cada 6 strings
            if (contador % 6 == 0) {
                partido = new PartidoJugado();
                partidos.add(partido);
            }
            partido.setEq1(campos[2]);
            partido.setEq2(campos[5]);
            partido.setNroRonda(campos[0]);
            partido.setNroPartido(campos[1]);
            partido.setGolesEq1(Integer.parseInt(campos[3]));
            partido.setGolesEq2(Integer.parseInt(campos[4]));
            System.out.println(partido.getEq2() + " : " + partido.getResultadoEq2());
            contador++;
        }
        scanner.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    return partidos;
}
*/
}


