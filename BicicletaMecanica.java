public class BicicletaMecanica extends Bicicleta {
    private int numeroVelocidades;
    private String tipoFrenos;

    // Constructor que llama al constructor de la clase padre
    public BicicletaMecanica(String marca, String modelo, double peso, String numeroSerie,
                             int numeroVelocidades, String tipoFrenos) {
        super(marca, modelo, peso, numeroSerie); // Llama al constructor de Bicicleta
        this.numeroVelocidades = numeroVelocidades;
        this.tipoFrenos = tipoFrenos;
    }

    public String getDescripcionTecnica() {
        return "Velocidades: " + numeroVelocidades + ", Frenos: " + tipoFrenos;
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println(getDescripcionTecnica());
    }

    // Getters específicos
    public int getNumeroVelocidades() {
        return numeroVelocidades;
    }

    public String getTipoFrenos() {
        return tipoFrenos;
    }
}