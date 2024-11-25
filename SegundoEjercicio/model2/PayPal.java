package SegundoEjercicio.model2;

public class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado con PayPal: " + correoElectronico);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Pago con PayPal " + correoElectronico + " cancelado.");
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}

