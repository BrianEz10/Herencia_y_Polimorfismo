package SegundoEjercicio.model2;

import java.util.ArrayList;

public class Pagos {
    private ArrayList<MetodoPago> metodosPago;

    public Pagos() {
        this.metodosPago = new ArrayList<>();
    }

    public void agregarMetodoPago(MetodoPago metodo) {
        metodosPago.add(metodo);
    }

    public void realizarPagos(double monto) {
        for (MetodoPago metodo : metodosPago) {
            metodo.realizarPago(monto);
        }
    }

    public void cancelarPagos() {
        for (MetodoPago metodo : metodosPago) {
            if (metodo instanceof Cancelable) {
                ((Cancelable) metodo).cancelarPago();
            }
        }
    }

    public void mostrarMetodosPago() {
        for (MetodoPago metodo : metodosPago) {
            System.out.println("Titular: " + metodo.getTitular() + ", Número: " + metodo.getNumero());
        }
    }
}

