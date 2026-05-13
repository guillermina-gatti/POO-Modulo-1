import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Lista
        ArrayList <Animal> listaDeAnimales = new ArrayList<>();

        Animal animal1=  new Perro("Momo", 1, 111, 11, "caniche", "huesos",1, "pelota");
        Animal animal2= new Perro("Momo", 1, 111, 11, "caniche", "huesos",1, "pelota");

     //   System.out.println(animal1.equals(animal2));
//        No son iguales los perros porque los codigos son diferentes

        //Privado es mas protegido. SOLO PODEMOS ACCEDER DESDE LA PROPIA CLASE
        //Protected clase hija y el paquete.

        //Como es protected puedo cambiarlo
        //animal1.comida= "palta";

        //Crear una lista de animales
        listaDeAnimales.add(animal1);
        listaDeAnimales.add(animal2);

        Animal animal3= new Gato("Mimi", 1, 111, 11, "calleConVereda", "huesos",1);

//        System.out.println(listaDeAnimales.contains(animal3));
        //Da verdadero cuando usamos instanceOf porque comparten nombre, codigo y son animales los dos.

//        System.out.println(listaDeAnimales.contains(animal3));

        listaDeAnimales.add(animal3);

//        listaDeAnimales.remove(1);
//        System.out.println(listaDeAnimales);
        System.out.println(verificarSiEstaEnLaLista(listaDeAnimales, animal1));

//        System.out.println("Animales de la clase Animal listados en el Array");
//        for (Animal animal : listaDeAnimales) { //Arraylist mantiene el orden
//            System.out.println(animal); //Nos muestra el 1er elemento de la lista, el 2do y el 3ro.
//            System.out.println(animal.sonidoCaracteristico()); //Sonido caracteristico de cada animal
//        }
    }
    public static String verificarSiEstaEnLaLista(ArrayList<Animal> listaDeAnimales, Animal animal){
        if (listaDeAnimales.contains(animal)){
//            return String.format("El %s esta en la lista", animal.toString());
            return "El animal "+ animal.getNombre()+" esta en la lista ";
        } else{
            return "El animal no esta en la lista";
        }
    }
}