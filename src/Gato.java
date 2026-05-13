public class Gato extends Animal {
    private int cantidadDePresas;

    public Gato(String nombre, int edad, int codigo, double peso, String raza, String comida, int cantidadDePresas) {
        super(nombre, edad, codigo, peso, raza, comida);
        this.cantidadDePresas = cantidadDePresas;
    }


    @Override
    public void comer() {
        System.out.println("El gato esta comiendo");
    }

    @Override
    public void comer(String alimentoBalanceado) {
        System.out.println("Comiendo "+alimentoBalanceado);
    }

    public int getCantidadDePresas() {
        return cantidadDePresas;
    }

    public void setCantidadDePresas(int cantidadDePresas) {
        this.cantidadDePresas = cantidadDePresas;
    }

    //    @Override  NO PUEDO SOBRESCRIBIRLO PORQUE LA CLASE PADRE TIENE EL METODO UN FINAL.
//    public void dormir(){
//
//    }

    @Override
    public String sonidoCaracteristico() {
        return"Miau!";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Gato)) return false;
        return super.equals(o) && this.cantidadDePresas == ((Gato) o).cantidadDePresas;
    }

    @Override
    public String toString() {
        return "Gato{" +
                super.toString()+
                "comida='" + comida + '\'' +
                ", cantidadDePresas=" + cantidadDePresas +
                '}'+ "\n";
    }
}