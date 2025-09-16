public class BicicletaElectrica extends Bicicleta {
    private double capacidadBateria;
    private double nivelCarga;

    // Constructor que llama al constructor de la clase padre
    public BicicletaElectrica(String marca, String modelo, double peso, String numeroSerie,
                              double capacidadBateria) {
        super(marca, modelo, peso, numeroSerie); // Llama al constructor de Bicicleta
        this.capacidadBateria = capacidadBateria;
        this.nivelCarga = 100; // Carga inicial completa
    }

    public double calcularAutonomia() {
        return (capacidadBateria * nivelCarga / 100) / 10; // Fórmula simplificada
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Autonomía: " + calcularAutonomia() + " km");
        System.out.println("Nivel de carga: " + nivelCarga + "%");
    }

    // Getter y setter específico
    public double getNivelCarga() {
        return nivelCarga;
    }

    public void setNivelCarga(double nivelCarga) {
        this.nivelCarga = nivelCarga;
    }
}