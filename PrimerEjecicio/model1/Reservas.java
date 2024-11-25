package PrimerEjecicio.model1;

import java.util.ArrayList;

public class Reservas {
    private ArrayList<Vuelo> vuelos;

    public Reservas() {
        this.vuelos = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Vuelo vuelo : vuelos) {
            total += vuelo.calcularPrecio();
        }
        return total;
    }

    public void aplicarPromociones(double descuento) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion(descuento);
            }
        }
    }

    public void mostrarVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println("Vuelo: " + vuelo.getNumeroVuelo() + ", Origen: " + vuelo.getOrigen() +
                    ", Destino: " + vuelo.getDestino() + ", Fecha: " + vuelo.getFecha() +
                    ", Precio: $" + vuelo.calcularPrecio());
        }
    }
}
