public class Caballo extends Animal{
    private String color;

    public Caballo(String nombre, int edad, int codigo, double peso, String raza, String comida, String color) {
        super(nombre, edad, codigo, peso, raza, comida);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void cabalgar(){
        System.out.println("Cabalgando");
    }

    @Override
    public void comer(String alimentoBalanceado){
        System.out.println("Los caballos "+ alimentoBalanceado);
    }

    @Override
    public String sonidoCaracteristico(){
        return"Iiiiihhh!";
    }

    @Override
    public String toString() {
        return "Caballo{" +
                super.toString()+
                "color='" + color + '\'' +
                ", comida='" + comida + '\'' +
                '}'+ "\n";
    }
}
