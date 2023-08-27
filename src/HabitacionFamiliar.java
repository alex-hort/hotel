
public class HabitacionFamiliar extends Habitacion {  // Nueva clase que hereda de Habitacion
    private int numeroCamasNinos;

    public HabitacionFamiliar(int numero, double precioPorNoche, int numeroCamasNinos) {
        super(numero, precioPorNoche);
        this.numeroCamasNinos = numeroCamasNinos;
    }

    public int getNumeroCamasNinos() {
        return numeroCamasNinos;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de camas de niños: " + numeroCamasNinos);
    }
}