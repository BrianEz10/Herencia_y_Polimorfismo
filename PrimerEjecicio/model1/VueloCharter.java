package PrimerEjecicio.model1;

public class VueloCharter extends Vuelo implements Promocionable {
    private double precioTotal;

    public VueloCharter(String numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion(double descuento) {
        this.precioTotal -= this.precioTotal * descuento / 100;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
