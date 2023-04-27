package Integrador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Integrador_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Estoy andando");
	System.out.println("llamando el Enum de Resultados: "+listaResultados.GANADOR);
	Equipos prueba=new Equipos();
	prueba.nombre="saca chispa";
	prueba.descripcion="Es un objeto pureba de la clase Equipos";
	System.out.println(prueba.getNombre()+" : "+prueba.getDescripcion());
	
	String RutaInfoOficial="C:\\Users\\Usuario\\Documents\\GitHub\\UTN-LucasDiezPe-Trabajos\\ProyectoIntegrador_LucasDP\\src\\Integrador\\Archivos\\resultados.csv";
	
	rondaTorneo rondaTorneo = new rondaTorneo();
	ArrayList<PartidoJugado>partidos=rondaTorneo.leerCSV(RutaInfoOficial);
	
	String RutaPronosticos="C:\\Users\\Usuario\\Documents\\GitHub\\UTN-LucasDiezPe-Trabajos\\ProyectoIntegrador_LucasDP\\src\\Integrador\\Archivos\\pronostico.csv";
	
	pronosticoApostado pronosticoApostado = new pronosticoApostado();
	ArrayList<pronosticoApostado>apuestas=pronosticoApostado.leerApuestaCSV(RutaPronosticos);
	int puntos=0;
	int acierto=3;
	
	for (PartidoJugado partido : partidos) {
	    for (pronosticoApostado apuesta : apuestas) {
	        if (partido.getNroRonda().equals(apuesta.getNroRonda()) && 
	            partido.getNroPartido().equals(apuesta.getNroPartido())) {
	           
	            String pronostico = apuesta.getResultadoEq2();
	            String resultado = partido.getResultadoEq2();
	            if (pronostico.equals(resultado)) {
	               puntos+=acierto;
	                System.out.println("El pronóstico para el partido " + 
	                    partido.getNroPartido() + " de la ronda " + partido.getNroRonda() +
	                    " fue correcto.");
	            } else {
	               
	                System.out.println("El pronóstico para el partido " + 
	                    partido.getNroPartido() + " de la ronda " + partido.getNroRonda() +
	                    " fue incorrecto.");
	            } System.out.println("los puntos obtenidos por el Apostador : "+apuesta.getApostador()+" han sido : "+puntos);
	        }
	    }
	}
	//for (pronosticoApostado apuesta : apuestas) { System.out.println("los puntos obtenidos por el Apostador : "+apuesta.getApostador()+" han sido : "+puntos);}

	}}