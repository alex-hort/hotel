public class Suite extends Habitacion {  // Nueva clase que hereda de Habitacion
    private int numeroCamas;
    private int numeroBanios;

    public Suite(int numero, double precioPorNoche, int numeroCamas, int numeroBanios) {
        super(numero, precioPorNoche);
        this.numeroCamas = numeroCamas;
        this.numeroBanios = numeroBanios;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public int getNumeroBanios() {
        return numeroBanios;
    }

    public double calcularCostoTotal(int numeroNoches) {  // Método para calcular el costo total de la estadía
        return getPrecioPorNoche() * numeroNoches;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de camas: " + numeroCamas);
        System.out.println("Numero de baños: " + numeroBanios);
    }
}
