package com.mycompany.deportistas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Deportistas {

    static ArrayList<Persona> personas = new ArrayList<>();
    static ArrayList<String> deportes = new ArrayList<>();
    static ArrayList<Deportista> deportistas = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);
    static HashSet<Deportista> listado = new HashSet<>();
    

    public static void main(String[] args) {
        deportes.add("Patinaje");
        deportes.add("Karate");
        deportes.add("Judo");
        deportes.add("Escalada");

        while (true) {

            System.out.println("Introduce el nombre del deportista: ");
            String nombre = entrada.next();
            System.out.println("Introduce el apellido del deportista: ");
            String apellido = entrada.next();
            System.out.println("Introduce la edad del deportista: ");
            int edad = entrada.nextInt();
            Persona personita = new Persona(nombre, apellido, edad);
            System.out.println("El deportista fué creado " + personita);
            personas.add(personita);
            System.out.println("Desea ingresar otra persona");
            String respuesta = entrada.next();
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }
        }
        for (Persona p : personas) {
            Deportista deportista = new Deportista(p.getNombre(), p.getApellido(), p.getEdad());
            deportistas.add(deportista);

        }
        System.out.println("¿Qué deporte deseas ver? \n1. Patinaje \n2. Karate \n3. Judo \n4. Escalada");
        int opcion = entrada.nextInt();
        for (Deportista d : deportistas) {
            if (opcion == 1) {
                if (d.getDeporte().equalsIgnoreCase("Patinaje")) {//instanceof me dice si el elemento pertenece a esa clase
                    System.out.println(d); // imprime y va al siguiente   
                    listado.add(d);
                }
            } else if (opcion == 2) {
                if (d.getDeporte().equalsIgnoreCase("Karate")) {
                    System.out.println(d); // imprime y va al siguiente
                    listado.add(d);
                }
            } else if (opcion == 3) {
                if (d.getDeporte().equalsIgnoreCase("Judo")) {
                    System.out.println(d); // imprime y va al siguiente
                    listado.add(d);
                }
            } else if (opcion == 4) {
                if (d.getDeporte().equalsIgnoreCase("Escalada")) {
                    System.out.println(d); // imprime y va al siguiente
                    listado.add(d);
                }
            }

        }
        System.out.println("El listado de deportistas es: ");
            for (Deportista p : listado) {
                System.out.println(p);
            }
    }
}
