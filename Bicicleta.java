public abstract class Bicicleta {
    protected String marca;
    protected String modelo;
    protected double peso;
    protected String estado;
    protected String numeroSerie;

    // Constructor de la clase base
    public Bicicleta(String marca, String modelo, double peso, String numeroSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.numeroSerie = numeroSerie;
        this.estado = "disponible"; // Estado por defecto
    }

    public void mostrarEstado() {
        System.out.println("Bicicleta " + marca + " " + modelo + " - Estado: " + estado);
    }

    public void registrarMantenimiento() {
        this.estado = "en mantenimiento";
        System.out.println("Mantenimiento registrado para bicicleta " + numeroSerie);
    }

    // Getters
    public String getEstado() {
        return estado;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    // Setters
    public void setEstado(String estado) {
        this.estado = estado;
    }
}

// Clase BicicletaElectrica


// Clase principal para demostrar el funcionamiento
