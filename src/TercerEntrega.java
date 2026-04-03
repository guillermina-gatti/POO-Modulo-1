//Clases de Local Date

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
//Clase del Local Date para obtener dias exactos
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TercerEntrega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //        System.out.println("Escribí tu nombre:");
        //        String nombre = sc.nextLine();

//        Merge en un repo local utilizando Git Bash en Intellij
//
//        1. Crea un nuevo repositorio remoto y vincularlo con uno local.
//        2. En la rama main crear un documento con el comando touch merge.txt
//        3. Crear y pasar a la rama clase5 con el comando git checkout -b clase5.
//        4. Abrir el documento con nano merge.txt y escribir una rima. Una vez
//        listo guardar con ctrl + o , confirmar cambios y salir con ctrl + x.
//        5. Hacer git add - y commit -m "mensaje" para guardar los cambios.
//        6. Volver a la rama main con git checkout main.
//        7. Modificar el documento nuevamente y guardarlo.
//        8. Hacer git add - y commit -m "mensaje" para guardar los cambios.
//        9. Escribir git merge clase5.

//        Verán que indica que existe un conflicto y sugiere una posible
//        integración, seleccionen la opción "resolver conflictos" y podrán crear
//        un nuevo archivo fusionado en la ventana del centro. Si se equivocan
//        pueden cancelar con el botón “x” y volver a realizar el merge. Una vez
//        listo aplican los cambios.
//        Por último realizamos el commit correspondiente indicando cuales
//        archivos se fusionaron o el por qué.

//        1. Crear dos variables de tipo Integer,si son divisibles por 2 y 7
//        convertirlos en String y concatenarlos.
//        Integer variable1 = 14;
//        Integer variable2 = 28;
//
//        if (variable1 % 2 == 0 && variable1 % 7 == 0 && variable2 % 2 == 0 && variable2 % 7 == 0) {
//            String texto1 = variable1.toString();
//            String texto2 = variable2.toString();
//            String resultado = "variable 1:" + texto1 + ", variable 2:" + texto2;
//
//            System.out.println(resultado);
//        }


//        2. Crea una fecha de nacimiento y calcula la edad. Además imprimí
//        por consola la edad, junto con la fecha formateada de esta forma “YY MM DD”.

//        LocalDate nacimiento = LocalDate.of(2000, 8, 10);
//        LocalDate hoy = LocalDate.now();
//
//        int edad = Period.between(nacimiento, hoy).getYears();
//
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yy MM dd");
//        String fechaFormateada = nacimiento.format(formato);
//
//        System.out.println("Edad: " + edad);
//        System.out.println("Fecha: " + fechaFormateada);

//        3. Crear una función que reciba un int, lo convierta a String y
//        compare con otro String en caso de ser iguales debe incluirse un mensaje.
//        System.out.println(compararNumeros(2026, "2026"));
//        System.out.println(compararNumeros(2025, "2026"));

//        4. Crear una función que reciba un String y un número, y devuelva la
//        letra que está en esa posición, junto con el largo total.
        System.out.println(compararDatos("Hello", 0));

//        5. Crear una función que reciba una fecha de vencimiento para
//        calcular los días restantes al vencimiento.
        System.out.println("Ingresa el anio de vencimiento:");
        int anio = sc.nextInt();

        System.out.println("Ingresa el mes de vencimiento:");
        int mes = sc.nextInt();

        System.out.println("Ingresa el dia de vencimiento:");
        int dia = sc.nextInt();

        LocalDate fechaVencimiento = LocalDate.of(anio, mes, dia);

        String resultado = diasRestantes(fechaVencimiento);

        System.out.println(resultado);
    }

    public static String compararNumeros(int numero, String texto) {
        //Static significa que pertenece a la clase. No de los objetos
        String convertir = String.valueOf(numero);
        //Lo convertimos para que sean iguales
        if (convertir.equals(texto)) return "Son iguales";
        else return "Son distintos";
    }

    public static String compararDatos(String texto, int posicion) {
        if (posicion < 0 || posicion >= texto.length()) return "Dato invalido";

        char letra = texto.charAt(posicion);
        int largo = texto.length();
        return "Letra: " + letra + ", Largo: " + largo;
    }

    public static String diasRestantes(LocalDate vencimiento) {
        LocalDate hoy= LocalDate.now();
        long dias= ChronoUnit.DAYS.between(hoy, vencimiento);

        if (dias < 0) return "El producto ya venció hace " + (dias*-1) + " días";
        else if (dias == 0) return "El producto vence hoy";
        else return "Dias restantes: " + dias;
    }
//                | metodos           | Sirve para:|
//                | `period`| años/meses/días separados|
//                | `chronoUnit.days` | diferencia exacta en días|

}
