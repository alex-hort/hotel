public class HabitacionDoble extends Habitacion {      // Herencia: HabitacionDoble hereda de Habitacion
    private int numeroCamas;                          // Nueva propiedad específica de HabitacionDoble

    public HabitacionDoble(int numero, double precioPorNoche, int numeroCamas) {
        super(numero, precioPorNoche);                // Llama al constructor de la clase base para inicializar propiedades heredadas
        this.numeroCamas = numeroCamas;
    }

    public int getNumeroCamas() {                     // Encapsulamiento: Método público para acceder a la propiedad privada
        return numeroCamas;
    }

    @Override
    public void mostrarInformacion() {                // Polimorfismo: Sobrescribe el método de la clase base para un comportamiento específico
        super.mostrarInformacion();                    // Llama al método de la clase base para mostrar información general
        System.out.println("Numero de camas: " + numeroCamas);
    }
}
