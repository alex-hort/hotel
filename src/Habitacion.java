// Clase base que representa una habitación en un hotel
public class Habitacion {
    private int numero;
    private double precioPorNoche;

    // Constructor para inicializar una habitación
    public Habitacion(int numero, double precioPorNoche) {
        this.numero = numero;
        this.precioPorNoche = precioPorNoche;
    }

    // Método para obtener el número de habitación
    public int getNumero() {
        return numero;
    }

    // Método para obtener el precio por noche
    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    // Método para mostrar información de la habitación
    public void mostrarInformacion(){
        System.out.println("Numero de habitacion: " + numero);
        System.out.println("Precio por noche: " + precioPorNoche);
    }
}
