package PrimerEjecicio;

import PrimerEjecicio.model1.Reservas;
import PrimerEjecicio.model1.VueloCharter;
import PrimerEjecicio.model1.VueloRegular;

public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        VueloRegular vuelo1 = new VueloRegular("VR123", "Buenos Aires", "Córdoba", "2024-12-01", 100, 1500);
        VueloRegular vuelo2 = new VueloRegular("VR456", "Buenos Aires", "Mendoza", "2024-12-05", 80, 1200);

        VueloCharter vuelo3 = new VueloCharter("VC789", "Buenos Aires", "Madrid", "2024-12-10", 200000);

        reservas.agregarVuelo(vuelo1);
        reservas.agregarVuelo(vuelo2);
        reservas.agregarVuelo(vuelo3);

        System.out.println("Vuelos antes de la promoción:");
        reservas.mostrarVuelos();

        reservas.aplicarPromociones(10); // 10% de descuento

        System.out.println("\nVuelos después de la promoción:");
        reservas.mostrarVuelos();

        System.out.println("\nPrecio total de las reservas: $" + reservas.calcularPrecioTotal());
    }
}

