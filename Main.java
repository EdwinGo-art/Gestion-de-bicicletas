public class Main {
    public static void main(String[] args) {
        // Crear bicicletas usando los constructores
        BicicletaElectrica biciElectrica = new BicicletaElectrica("EcoRide", "Modelo E", 20.5, "ER2023001", 500);
        BicicletaMecanica biciMecanica = new BicicletaMecanica("Trek", "Marlin", 13.1, "TK2023002", 21, "disco");

        // Cambiar estados
        biciElectrica.setEstado("en uso");
        biciElectrica.setNivelCarga(75); // Reducir carga

        // Mostrar estados (polimorfismo)
        System.out.println("=== ESTADO DE BICICLETAS ===");
        biciElectrica.mostrarEstado();
        System.out.println("-----------------------------");
        biciMecanica.mostrarEstado();

        // Registrar mantenimiento
        System.out.println("\n=== REGISTRO DE MANTENIMIENTO ===");
        biciMecanica.registrarMantenimiento();
        System.out.println("Nuevo estado: " + biciMecanica.getEstado());

        // Demostrar polimorfismo con una lista
        System.out.println("\n=== LISTA DE BICICLETAS  ===");
        Bicicleta[] bicicletas = new Bicicleta[2];
        bicicletas[0] = biciElectrica;
        bicicletas[1] = biciMecanica;

        for (Bicicleta bici : bicicletas) {
            bici.mostrarEstado();
            System.out.println("-----------------------------");
        }
    }
}
