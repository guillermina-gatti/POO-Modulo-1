import java.util.Scanner;

public class SegundaEntrega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Escribí tu nombre:");
//        String nombre = sc.nextLine();

//        1. Crea el primer repositorio remoto para la materia.
//        2. Vincularlo con uno local(Realizar un primer commit sobre la rama main).
//        3. Crear y pasar a la rama Clase_4_SintaxisJAVA.
//        4. Subir los primeros ejercicios de hoy en esa rama.

//        Git clone → Vinculando repos
//        1. Escribir git clone urlDelRepositorio(code) en el directorio requerido.
//        2. Acceder al directorio descargado con cd nombreCarpeta.
//        3. Escribir git status o git remote -v para comprobar la vinculación.
//        4. Completar con los datos del autor:
//        a. git config --global user.email "correo"
//        b. git config --global user.name "usuario github"
//        5. Realizar los cambios.
//        6. Una vez listo, guardar las modificaciones y guardar los cambios:
//        7. git add .
//        8. git commit -m "mensaje"
//        9. git push origin nombreRamaRemota.( Login- requiere permisos)

//        1. Escribir una función que evalúe si un estudiante cumple con los requisitos
//        para promocionar y defina un mensaje personalizado para cada caso. El estudiante
//        debe contar con al menos el 80% de asistencia, haber presentado los trabajos
//        y obtener una nota mayor o igual a seis en el examen final.

//        System.out.println("Requisitos para la promoción:\nIngrese la cantidad de clases a las que asistió:");
//        int asistencia = sc.nextInt();
//
//        System.out.println("Confirme que presentó todos los trabajos prácticos de la materia con True o False:");
//        boolean trabajosPracticos = sc.nextBoolean();
//
//        System.out.println("Ingrese la nota del examen final:");
//        int examenFinal = sc.nextInt();
//
//        System.out.println(consultarSiAprobo(asistencia, trabajosPracticos, examenFinal));

//        2. Crea una función que reciba un nombre y retorne la inicial del mismo. Debe
//        contar la cantidad de veces que se repite dicho carácter.
        System.out.println("Ingrese un nombre: ");
        String nombre = sc.nextLine();
        System.out.println(obtenerInicial(nombre));
    }

    // El estudiante debe contar con al menos el 80% de asistencia, haber presentado los trabajos
//        y obtener una nota mayor o igual a seis en el examen final.
    public static String consultarSiAprobo(int asistencia, boolean trabajos, int examenFinal) {
        //Static significa que pertenece a la clase. No de los objetos
        //Definir todos los casos posibles.
        //Porcentaje de asistencia.
        double clasesTotales = 46;
        double porcentajeDeAsistencia = (80 * clasesTotales) / 100;

        if (asistencia >= porcentajeDeAsistencia) {
            if (trabajos) {
                if (examenFinal >= 6) {
                    System.out.println("Promociona la materia");
                    return "Promociona la materia";
                } else {
                    System.out.println("No aprobó el examen final.");
                    return "No aprobó el examen final.";
                }
            } else {
                System.out.println("No puede rendir el examen final");
                return "No aprobó el examen final.";
            }
        } else {
            System.out.println("Pasó la cantidad de clases disponibles");
            return "No aprobó el examen final.";
        }
    }
    public static String obtenerInicial(String nombre){
        //Static significa que pertenece a la clase. No de los objetos
        char inicialDelNombre= nombre.toUpperCase().charAt(0);
        return "Inicial del nombre es: "+ inicialDelNombre;
    }
}