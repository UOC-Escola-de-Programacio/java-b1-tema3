/**
 * Exercici 4 – Tema 3 – Polimorfisme
 *
 * Es demana crear una jerarquia de classes per representar diferents tipus de notificacions.
 * Aquest exercici té com a objectiu practicar l'ús del **polimorfisme** en Java.
 *
 * La classe base ha de ser Notification, amb un atribut String recipient i un mètode void send().
 * Les subclases seran:
 *
 * - EmailNotification: afegeix un atribut subject i sobrescriu send() per mostrar:
 *   "Sending EMAIL to <recipient> with subject: <subject>"
 *
 * - SMSNotification: afegeix un atribut phoneNumber i sobrescriu send() per mostrar:
 *   "Sending SMS to <recipient> at phone number: <phoneNumber>"
 *
 * - PushNotification: sobrescriu send() per mostrar:
 *   "Sending PUSH notification to <recipient>"
 *
 * Crea objectes de cada tipus i invoca el mètode send() de forma individual
 * per comprovar el comportament polimòrfic.
 *
 *
 * Exemple:
 * Notification email = new EmailNotification("anna@example.com", "Meeting Reminder");
 * Notification sms = new SMSNotification("David", "+34600111222");
 * Notification push = new PushNotification("user123");
 *
 * email.send();
 * sms.send();
 * push.send();
 *
 * // Sortida:
 * // Sending EMAIL to anna@example.com with subject: Meeting Reminder
 * // Sending SMS to David at phone number: +34600111222
 * // Sending PUSH notification to user123
 *
 *
 * Ejercicio 4 – Tema 3 – Polimorfismo
 *
 * Se pide crear una jerarquía de clases para representar distintos tipos de notificaciones.
 * Este ejercicio tiene como objetivo practicar el uso del **polimorfismo** en Java.
 *
 * La clase base debe ser Notification, con un atributo String recipient y un método void send().
 * Las subclases serán:
 *
 * - EmailNotification: añade un atributo subject y sobrescribe send() para mostrar:
 *   "Sending EMAIL to <recipient> with subject: <subject>"
 *
 * - SMSNotification: añade un atributo phoneNumber y sobrescribe send() para mostrar:
 *   "Sending SMS to <recipient> at phone number: <phoneNumber>"
 *
 * - PushNotification: sobrescribe send() para mostrar:
 *   "Sending PUSH notification to <recipient>"
 *
 * Crea objetos de cada tipo y llama al método send() de forma individual
 * para comprobar el comportamiento polimórfico.
 *
 * Ejemplo:
 * Notification email = new EmailNotification("anna@example.com", "Meeting Reminder");
 * Notification sms = new SMSNotification("David", "+34600111222");
 * Notification push = new PushNotification("user123");
 *
 * email.send();
 * sms.send();
 * push.send();
 *
 * // Salida:
 * // Sending EMAIL to anna@example.com with subject: Meeting Reminder
 * // Sending SMS to David at phone number: +34600111222
 * // Sending PUSH notification to user123
 */
public class Notification {
    protected String recipient;

    public Notification(String recipient) {
        // TODO: assign recipient
    }

    public void send() {
        // TODO: implement base send method or leave for override
    }

	// -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    /*
    public static void main(String[] args) {
        Notification email = new EmailNotification("anna@example.com", "Meeting Reminder");
        Notification sms = new SMSNotification("David", "+34600111222");
        Notification push = new PushNotification("user123");

        email.send();
        sms.send();
        push.send();
    }
    */
    // Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
  
}
