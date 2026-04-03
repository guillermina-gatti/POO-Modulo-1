import java.util.Scanner;
import java.util.Arrays;

public class CuartaEntrega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //        System.out.println("Escribí tu nombre:");
        //        String nombre = sc.nextLine();

        //Clase 7
//        1. Crea un array de cuatro películas e imprimirlas por orden alfabético utilizando for-each.
        String[] peliculas = {"Constantine", "la casa del lago", "los siete pecados capitales", "matrix"};

//        //Ordenamos las peliculas primero y despues mostramos
//        Arrays.sort(peliculas);
//        // Mostrar resultado
//        for (String pelicula : peliculas) {
//            System.out.println(pelicula);
//        }

//        2. Crea un nuevo array que contenga la lista de películas en mayúscula.
//        String[] nuevoArray = new String[peliculas.length];
//
//        //Usamos un for para cambiar todas las letras a mayuscula
//        for (int i = 0; i < peliculas.length; i++) {
//            nuevoArray[i] = peliculas[i].toUpperCase();
//        }
//        // Mostrar resultado
//        for (String pelicula : nuevoArray) {
//            System.out.println(pelicula);
//        }

//        3. Crea una copia para incluir dos títulos más, visualizarlo con un metodo de Arrays.
        //Copia con 2 espacios
//        String[] nuevoArray= Arrays.copyOf(peliculas, peliculas.length + 2);
//        // Agregar dos peliculas
//        nuevoArray[4]= "La Momia";
//        nuevoArray[5]= "La sociedad de los poetas muertos";
//        //Metodo arrays
//        System.out.println(Arrays.toString(nuevoArray));

//        4. Crea una variable que guardará la primera película que comience con “L”, se debe recorrer el array
//        buscando el primer resultado.
//        String primeraPeliculaConL= null;
//        for (int i=0; i<peliculas.length; i++) {
//            //Frenamos el codigo con el break para que se detenga cuando encuentre la primer pelicula
//            if (peliculas[i].startsWith("l") || peliculas[i].startsWith("L")) {
//                primeraPeliculaConL=peliculas[i];
//                break;
//            }
//        }
//        System.out.println("Primera pelicula con L es: "+primeraPeliculaConL);

        //        5. Pedir 3 notas(Scanner), guardarlas en un array y calcular el promedio. A continuación mostrar el
//        mayor y el menor.
//        double[] notas = new double[3];
//        //Pedimos las notas
//        for (int i = 0; i < notas.length; i++) {
//            System.out.println("Ingresa la nota " + (i + 1) + ":");
//            notas[i] = sc.nextDouble();
//        }
//        //Calcular
//        double suma = 0;
//        double mayor = notas[0];
//        double menor = notas[0];
//        for (int i = 0; i < notas.length; i++) {
//            suma += notas[i];
//            if (notas[i] > mayor) mayor = notas[i];
//            if (notas[i] < menor) menor = notas[i];
//        }
//        double promedio = suma / notas.length;
//
//        // Mostrar resultados
//        System.out.println("Promedio: " + promedio);
//        System.out.println("Mayor nota: " + mayor);
//        System.out.println("Menor nota: " + menor);

        //Clase 8
//        Utilizando la clase Scanner:
//        1. Escribir una función para calcular la cantidad de faltas disponibles de acuerdo a
//        un porcentaje de asistencia y cantidad de encuentros determinado¿Cuál es el
//        resultado para una cursada de 23 encuentros que requiere un 75% de asistencia? ¿Y
//        para el caso de este módulo?
//        System.out.println("Ingresa la cantidad de clases:");
//        int clases = sc.nextInt();
//
//        System.out.println("Ingresa el porcentaje de asistencia:");
//        double porcentaje = sc.nextDouble();
//
//        calcularFaltas(clases, porcentaje);

//        2. Ahora requerimos una función en la cual se solicite al usuario que ingrese
//        hasta cinco destinos turísticos por separado validando lo ingresado. Debe
//        guardarlos en un nuevo Array retornando la información del mismo como un texto.
        System.out.println("Destinos ingresados: " + cargarDestinos());
    }
    public static void calcularFaltas(int clases, double porcentaje) {
        double asistenciaMinima = clases * porcentaje / 100;
        double faltasPermitidas = clases - asistenciaMinima;
        System.out.println("Asistencia minima: " + asistenciaMinima);
        System.out.println("Faltas permitidas: " + faltasPermitidas);
    }

    public static String cargarDestinos() {
        Scanner sc = new Scanner(System.in);
        //Para pedir los datos
        String[] destinos= new String[5];

        for (int i=0; i<5; i++) {
            System.out.println("Destino:");
            destinos[i]= sc.nextLine();
        }
        return Arrays.toString(destinos);
    }
}
