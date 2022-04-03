package proyectopoo;

import java.io.IOException;

/*
    Integrantes:
    
    Francisco Andres Muñoz Alarcon 20.242.456-2
    Anais Monserrat Foix Monardes  20.834.761-6
    Sofia Carolina Menzel Madrid   20.478.743-3
*/

public class ProyectoPOO {
    public static void main(String[] args)throws IOException { 
        Funciones prueba = new Funciones();
        prueba.leerCursos();
        prueba.mostrarCursos();
        prueba.LeerProfesores();
        prueba.mostrarProfesores();        
        prueba.LeerEstudiantes();
        prueba.mostrarEstudiantes();        
        prueba.leerOfertaLaboral();
        prueba.mostrarOfertasLaborales();
        prueba.mostrarOfertaLaboralDeterminada(6);
        prueba.mostrarOfertaLaboralDeterminada("Mantencion Bicicletas");
        prueba.mostrarEstudianteDeterminado(0);
        prueba.mostrarEstudianteDeterminado("8.245.567-8");
    }    
}
