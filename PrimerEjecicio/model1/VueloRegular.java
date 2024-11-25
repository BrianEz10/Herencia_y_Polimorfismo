package PrimerEjecicio.model1;

public class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private double precioPorAsiento;

    public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioPorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioPorAsiento = precioPorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioPorAsiento;
    }

    @Override
    public void aplicarPromocion(double descuento) {
        this.precioPorAsiento -= this.precioPorAsiento * descuento / 100;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public double getPrecioPorAsiento() {
        return precioPorAsiento;
    }

    public void setPrecioPorAsiento(double precioPorAsiento) {
        this.precioPorAsiento = precioPorAsiento;
    }
}
