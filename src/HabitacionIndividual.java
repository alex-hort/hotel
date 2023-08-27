public class HabitacionIndividual extends Habitacion {  // Herencia: HabitacionIndividual hereda de Habitacion
    private boolean tieneVistaAlMar;                  // Nueva propiedad específica de HabitacionIndividual

    public HabitacionIndividual(int numero, double precioPorNoche, boolean tieneVistaAlMar) {
        super(numero, precioPorNoche);                // Llama al constructor de la clase base para inicializar propiedades heredadas
        this.tieneVistaAlMar = tieneVistaAlMar;
    }

    public boolean tieneVistaAlMar() {               // Encapsulamiento: Método público para acceder a la propiedad privada
        return tieneVistaAlMar;
    }

    @Override
    public void mostrarInformacion() {              // Polimorfismo: Sobrescribe el método de la clase base para un comportamiento específico
        super.mostrarInformacion();                  // Llama al método de la clase base para mostrar información general
        System.out.println("Tiene vista al mar: " + (tieneVistaAlMar ? "SI" : "NO"));
    }
}