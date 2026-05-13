import java.util.Objects;

public class Animal {
    private String nombre;
    private int edad;
    private int codigo;
    private double peso;
    private String raza;
    protected String comida;

    public Animal(String nombre, int edad, int codigo, double peso, String raza, String comida) {
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = codigo;
        this.peso = peso;
        this.raza = raza;
        this.comida = comida;
    }

    public String getNombre() {
        return nombre;
    }

    public void comer() {
        System.out.println("Comiendo..");
    }

    public void comer(String comidaBalanceada) {
        System.out.println("Comiendo: "+comidaBalanceada);
    }

    public final void dormir() {
        System.out.println("Zzzzz...");
    }

    public String sonidoCaracteristico(){
        return"Todos los animales tienen un sonido caracteristico";
    }

    @Override
    public int hashCode() { //Siempre va a ser el mismo parametro en la sobrescritura
        return Objects.hash(this.nombre, this.codigo); //Atributos que usa para generar el hashcode o indice
        // donde se va a guardar en una estructura del tipo hashing, por ej: hashSet
        //Puede comparar mas de dos elementos
        //Los atributos que compara en el equals tiene que ser los mismos que usa para generar el hashcode
    }

    //Son anotaciones de java que le indica al interprete algo
    //En este caso sobrescribe
    @Override //NO TE OLVIDES DE DARLE UN PARAMETRO
    public boolean equals(Object o) {
        if(!(o instanceof Animal)){
            return false;
        }
            //Casting. Lo transformamos en la subclase para poder acceder a sus atributos y metodos
            Animal animalIngresado=(Animal) o;
            //codigo del animal o == el codigo del animal que esta comparando
            return animalIngresado.codigo == this.codigo && animalIngresado.nombre.equals(this.nombre);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", codigo=" + codigo +
                ", peso=" + peso +
                ", raza='" + raza + '\'' +
                ", comida='" + comida + '\'' +
                ", hashCode= "+ this.hashCode() +
                '}';
    }
}