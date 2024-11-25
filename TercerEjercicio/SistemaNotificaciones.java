package TercerEjercicio;

import TercerEjercicio.model3.CorreoElectronico;
import TercerEjercicio.model3.MensajeTexto;
import TercerEjercicio.model3.Notificaciones;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones notificaciones = new Notificaciones();

        CorreoElectronico correo = new CorreoElectronico("Lionel Messi", "Bienvenido a nuestro sistema", "LionelMessi@gmail.com");
        MensajeTexto mensaje = new MensajeTexto("Kylian Mbappe", "Tu pedido ha sido enviado", "+54 261 937-3827");

        notificaciones.agregarCanal(correo);
        notificaciones.agregarCanal(mensaje);

        System.out.println("Canales de notificación:");
        notificaciones.mostrarCanales();

        System.out.println("\nEnviando notificaciones...");
        notificaciones.enviarNotificaciones();

        System.out.println("\nPersonalizando mensajes...");
        notificaciones.personalizarMensajes("Siempre Buenos Dias, Buenas Tardes y Buenas Noches");

        System.out.println("\nEnviando notificaciones personalizadas...");
        notificaciones.enviarNotificaciones();
    }
}
