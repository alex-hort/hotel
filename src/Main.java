// Definición de la clase principal Main
public class Main {
    public static void main(String[] args) {

        // Creación de una instancia de HabitacionIndividual llamada habitacion1
        // Se le proporciona el número de habitación (101), el precio (1200) y un indicador de si está ocupada (true)
        Habitacion habitacion1 = new HabitacionIndividual(101, 1200, true);

        // Creación de una instancia de HabitacionDoble llamada habitacion2
        // Se le proporciona el número de habitación (202), el precio (1800) y la cantidad de camas (2)
        Habitacion habitacion2 = new HabitacionDoble(202, 1800, 2);

        // Impresión de información sobre la primera habitación
        System.out.println("Informacion de la primera habitacion: ");
        // Llamada al método mostrarInformacion() de la instancia habitacion1
        habitacion1.mostrarInformacion();
        System.out.println(); // Imprime una línea en blanco

        // Impresión de información sobre la segunda habitación
        System.out.println("Informacion de la segunda habitacion: ");
        // Llamada al método mostrarInformacion() de la instancia habitacion2
        habitacion2.mostrarInformacion();
//----------------------------------------------------------------------------------------------------------
        // Crear una instancia de Suite
        Suite suite = new Suite(301, 300.0, 2, 2);

        // Mostrar información de la Suite
        System.out.println("Información de la Suite:");
        suite.mostrarInformacion();
        System.out.println("Costo total por 3 noches: $" + suite.calcularCostoTotal(3));

        System.out.println("------------------------");

        // Crear una instancia de HabitacionFamiliar
        HabitacionFamiliar habitacionFam = new HabitacionFamiliar(401, 180.0, 2);

        // Mostrar información de la HabitacionFamiliar
        System.out.println("Información de la Habitación Familiar:");
        habitacionFam.mostrarInformacion();

        // Acceder al número de camas de niños de la HabitacionFamiliar
        System.out.println("Número de camas de niños: " + habitacionFam.getNumeroCamasNinos());
    }
}
