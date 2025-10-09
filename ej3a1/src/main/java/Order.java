/*
 * Exercici1 Tema 3:
 *
 * Crea una classe anomenada Order que representi una comanda d’un client.
 * La classe ha de contenir tres atributs privats: un identificador numèric (int id),
 * el nom del client (String customer), i l'import total de la comanda (double amount).
 * 
 * El constructor ha de permetre inicialitzar aquests tres atributs.
 * Si el nom del client és buit o nul, o si l'import és negatiu, no s’ha d’actualitzar el valor
 * i s’ha de mostrar un missatge per consola.
 *
 * També s’han d’implementar els mètodes get i set per a cada atribut.
 * 
 * Finalment, s’ha d’implementar el mètode toString() que retorni:
 * Order: <id>, Customer: <customer>, Amount: <amount>€
 * 
 * Exemple:
 * Order o = new Order(1, "Laura", 120.0);
 * System.out.println(o);
 * // Sortida: Order: 1, Customer: Laura, Amount: 120.0€
 * o.setCustomer("");
 * o.setAmount(-50);
 * // Missatges per consola:
 * // Customer name cannot be empty.
 * // Amount cannot be negative.
 *
 * ---
 *
 * Ejercicio1 Tema3:
 *
 * Crea una clase llamada Order que represente un pedido de un cliente.
 * La clase debe contener tres atributos privados: un identificador numérico (int id),
 * el nombre del cliente (String customer), y el importe total del pedido (double amount).
 *
 * El constructor debe inicializar estos tres atributos. Si el nombre del cliente es nulo o vacío, o si el importe es negativo, no se debe actualizar el valor y debe mostrarse un mensaje por consola.
 *
 * También deben implementarse los métodos get y set para cada atributo.
 *
 * Finalmente, debe implementarse el método toString() que devuelva:
 * Order: <id>, Customer: <customer>, Amount: <amount>€
 *
 * Ejemplo esperado:
 * Order o = new Order(1, "Laura", 120.0);
 * System.out.println(o);
 * // Salida: Order: 1, Customer: Laura, Amount: 120.0€
 * o.setCustomer("");
 * o.setAmount(-50);
 * // Mensajes por consola:
 * // Customer name cannot be empty.
 * // Amount cannot be negative.
 */


public class Order {
    
    // Private attributes
    private int id;
    private String customer;
    private double amount;

    // Constructor to initialize attributes
    // Use 'this' for id and setters for customer and amount
    public Order(int id, String customer, double amount) {
        // TODO: assign id
        // TODO: call setCustomer(customer)
        // TODO: call setAmount(amount)
    }

    // Getter for id
    public int getId() {
        // TODO: return id
       
    }

    // Setter for id
    public void setId(int id) {
        // TODO: assign this.id
    }

    // Getter for customer
    public String getCustomer() {
        // TODO: return customer
       
    }

    // Setter for customer
    // If customer is null or empty, print "Customer name cannot be empty."
    public void setCustomer(String customer) {
        // TODO: validate and assign customer
    }

    // Getter for amount
    public double getAmount() {
        // TODO: return amount
       
    }

    // Setter for amount
    // If amount is negative, print "Amount cannot be negative."
    public void setAmount(double amount) {
        // TODO: validate and assign amount
    }

    // toString method to return the order details as specified
    @Override
    public String toString() {
        // TODO: return "Order: " + id + ", Customer: " + customer + ", Amount: " + amount + "€"
        
    }
	 // -------------------------------------------------------------
    // Test manual per a probar amb l'IDE
	// Test manual para probar con el IDE
    // -------------------------------------------------------------
    /*
    public static void main(String[] args) {
        Order o = new Order(1, "Laura", 120.0);
        System.out.println(o);
        o.setCustomer("");
        o.setAmount(-50);
    }
    */
	// Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
}
