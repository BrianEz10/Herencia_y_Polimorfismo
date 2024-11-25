package SegundoEjercicio;

import SegundoEjercicio.model2.Pagos;
import SegundoEjercicio.model2.PayPal;
import SegundoEjercicio.model2.TarjetaCredito;

public class SistemaPagos {
    public static void main(String[] args) {
        Pagos pagos = new Pagos();

        TarjetaCredito tarjeta = new TarjetaCredito("Mario Pérez", "1234-5678-9876-5432", "12/25", "123");
        PayPal paypal = new PayPal("Robert Contreras", "98765", "robert@gmail.com");

        pagos.agregarMetodoPago(tarjeta);
        pagos.agregarMetodoPago(paypal);

        System.out.println("Métodos de pago disponibles:");
        pagos.mostrarMetodosPago();

        System.out.println("\nRealizando pagos...");
        pagos.realizarPagos(500);

        System.out.println("\nCancelando pagos...");
        pagos.cancelarPagos();
    }
}

