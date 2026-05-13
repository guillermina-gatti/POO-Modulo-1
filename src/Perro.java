public class Perro extends Animal {
    private int numeroCucha;
    private String juguete;

    public Perro(String nombre, int edad, int codigo, double peso, String raza, String comida, int numeroCucha, String juguete) {
        super(nombre, edad, codigo, peso, raza, comida);
        this.numeroCucha = numeroCucha;
        this.juguete = juguete;
    }

    public int getNumeroCucha() {
        return numeroCucha;
    }

    @Override
    public void comer(String alimentoBalanceado){
        System.out.println("Comiendo "+alimentoBalanceado);
    }

    @Override
    public String sonidoCaracteristico(){
        return"Woof, woof";
    }

    public void pastorean(){
        System.out.println("El perro esta pastoreando");
    }

    @Override
    public boolean equals(Object o) {
        if(!(super.equals(o))) return false;
        else {
            if(this.getClass() != o.getClass()){
                return false;
            }
            Perro perroIngresado= (Perro) o;
            return this.numeroCucha == perroIngresado.numeroCucha;
        }
    }

    @Override
    public String toString() {
        return "Perro{" +
                super.toString()+
                "comida='" + comida + '\'' +
                ", juguete='" + juguete + '\'' +
                ", numeroCucha=" + numeroCucha +
                '}'+ "\n";
    }
}
