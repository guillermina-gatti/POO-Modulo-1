import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //El nombre de las clases va en mayusculas
        //El nombre del metodo va en minuscula

        Scanner sc = new Scanner(System.in);

        //1. Creando las primeras variables en Java. En este caso serán cinco:
        // nombre, apellido, edad, peso y altura. Asignaremos un valor acorde a
        // su tipo y se visualizará por consola.
        String nombre = "Camila";
        String apellido = "Jimenez";
//        int edad = 22;
        double peso = 70;
        double altura = 165;

        //2. Imprimir por consola el nombre completo de la persona.
//        System.out.println("Nombre: " + nombre + ", apellido: " + apellido);

        //3. En este caso necesitamos calcular el IMC de la persona(peso/altura^2),
        // almacenar el resultado con decimales // y que se visualice en consola como
        // un entero.
//    double imc=0;
//
//    imc=(peso/(altura*altura));
//
//    System.out.println((int)imc);
        //Casting

        //4. Utiliza una estructura if para comprobar si la edad es par y múltiplo de 3.
//        int edad = 30;
//
//        if(edad%2==0 && edad%3==0){
//            //puede ser multiplo y par
//            System.out.println("Es multiplo de 3 y es par"); //30
//        } else if (edad%2!=0 && edad%3==0){
//            //Puede no ser par y ser multiplo
//            System.out.println("No es par, pero es multiplo de 3"); //21
//        } else if(edad%2==0 && edad%3!=0){
//            //Puede ser par y no ser multiplo
//            System.out.println("Es par, pero no es multiplo de 3"); //22
//        } else {
//            //Puede no ser par y no ser multiplo
//            System.out.println("No es par y no es multiplo de 3"); //7
//        }

        //5. Crea un programa que retorna un número de piso al ingresar un determinado sector. El sector a
        // corresponde al 2°, el b al 4° y el c al 10°.
        //CASE
//        System.out.println("Ingrese un sector: ");
//        String sector1 = sc.nextLine();
//
//        char sector= sector1.toUpperCase().charAt(0);
//
//        switch (sector){
//            case 'A':
//                System.out.println("Piso 2°");
//                break;
//            case 'B':
//                System.out.println("Piso 4°");
//                break;
//            case 'C':
//                System.out.println("Piso 10°");
//                break;
//            default:
//                System.out.println("El sector ingresado no corresponde a un piso existente.");
//        }

        //REPASO DE TECNICAS

//        1. Construir un algoritmo que permita ingresar un número, si el
//        número es mayor de 500, se debe calcular y mostrar en pantalla
//        el 18% de este.
//        Tip: Para calcular el porcentaje de un número solo debo
//        multiplicar el número por el porcentaje y luego dividir ese
//        resultado por 100.

//        System.out.println("Ingrese un numero: ");
//        double numero = sc.nextDouble();
//
//        double numeroNuevo=0;
//
//        if (numero > 500) {
//            numeroNuevo = numero + numero * 0.18;
//            System.out.println(numeroNuevo);
//        }


//        2. Hacer un programa que calcule la suma de los N primeros números
//        naturales, dónde N es el número límite ingresado por teclado.

//        System.out.println("Ingrese un numero: ");
//        int n = sc.nextInt();
//
//        int sum=0;
//        //Tener en cuenta la condicion en el N PARA VER EL LIMITE
//        for (int i=0; i<=n; i++){
//            sum=sum+i;
//        }
//
//        System.out.println("La suma total es: "+ sum);

//        3. Realizar un algoritmo en el cual se muestre cuáles números son
//        pares e impares partiendo del 1 al 20.

//        for (int i=1; i<=20; i++){
//            if(i%2==0){
//                System.out.println("El numero "+i+" es par");
//            }
//            if(i%2!=0){ //Esta linea evalua la condicion de los nros impares
//                System.out.println("El numero "+i+" es impar");
//            }
//        }

        //CLASE 3
//        2. Escribí un programa que multiplique todos los
//        números divisibles por 3 en el rango del 1 al 20.

//        for (int i=1; i<=20; i++){
//            if (i%3==0){
//                System.out.println("El resultado es: "+i*3);
//            }
//        }

//        3. Imprimí la cantidad de letras que tiene la variable nombre y la cantidad de vocales.
//         EJEMPLO --- String nombre = "Camila";

//        System.out.println("Escribí tu nombre:");
//        String nombre1 = sc.nextLine();
//        int n = (nombre1.length());
//
//        int cantV = 0;
//        for (int i = 0; i <= (n-1); i++) {
//            //Empezamos en 0. Usamos el length-1 por la cantidad de letras.
//            char nomChar = nombre1.toUpperCase().charAt(i);
//            if (nomChar == 'A' || nomChar == 'E' || nomChar == 'I' || nomChar == 'O' || nomChar == 'U') {
//                //Ojo con el ==
//                cantV = cantV + 1;
//            }
//        }
//
//        System.out.println("La cantidad de letras es igual a: " + n);
//        System.out.println("La cantidad de vocales es igual a: " + cantV);


//        Ejercicios con String
//        1. Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
//        mensaje.

        System.out.println("Escribí una frase:");
        String frase1 = sc.nextLine();
//        int n1 = (frase1.length()); //NO ES NECESARIO

        System.out.println("Escribí una frase:");
        String frase2 = sc.nextLine();
//        int n2 = (frase2.length()); // NO ES NECESARIO

        if (frase1.equals(frase2)){
            System.out.println("Son la misma cadena");
        } else {
            System.out.println("No son la misma cadena");
        }

//  //      NO ES NECESARIO
//        if(n1==n2){
//            if (frase1.equals(frase2)){
//                System.out.println("Son la misma cadena");
//            } else {
//                System.out.println("No son la misma cadena");
//            }
//        } else{
//            System.out.println("No son la misma cadena");
//        }


//        2. Imprimir por consola la cantidad de caracteres de la primer frase.

//        System.out.println("Escribí una frase: ");
//        String frase = sc.nextLine();
//        int n = (frase.length());
//        System.out.println("La cantidad de caracteres es igual a: " + n);

        //FUNCIONES
//        3. Crea una función en la que tengas que ingresar tu nombre y apellido por
//        separado, a partir de los mismos obtener tus iniciales en mayúscula.
        //pedir los datos

//        System.out.println("Escribí tu nombre:");
//        String nombre1 = sc.nextLine();
//
//        System.out.println("Escribí tu apellido:");
//        String apellido1 = sc.nextLine();
//
//        System.out.println(obtenerIniciales(nombre1, apellido1));
    }

    public static String obtenerIniciales(String nombre, String apellido) {
        //Static significa que pertenece a la clase. No de los objetos
        char inicialNombre = nombre.toUpperCase().charAt(0);
        char inicialApellido = apellido.toUpperCase().charAt(0);
        return "inicial del Apellido: " + inicialApellido + " Inicial del nombre: " + inicialNombre;
    }
}