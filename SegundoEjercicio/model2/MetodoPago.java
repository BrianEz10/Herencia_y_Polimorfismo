package SegundoEjercicio.model2;

public abstract class MetodoPago {
    private String titular;
    private String numero;

    public MetodoPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public abstract void realizarPago(double monto);

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
