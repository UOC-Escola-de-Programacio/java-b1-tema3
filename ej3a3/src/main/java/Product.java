/**
 * Exercici 3 Tema 3
 *
 * Es demana crear una jerarquia de classes per representar productes d’una botiga.
 *
 * La classe principal ha de ser Product, que conté tres atributs privats:
 * un identificador numèric (int id), el nom del producte (String name) i el preu (double price).
 * El constructor ha de permetre inicialitzar aquests atributs.
 * Si el nom és nul o buit, s’ha de mostrar "Product name cannot be empty."
 * Si el preu és negatiu, s’ha de mostrar "Price cannot be negative."
 * També s’han d’implementar els mètodes get i set per a cada atribut
 * i un mètode calculateDiscount(double percentatge).
 * Si el percentatge és inferior a 0 o superior a 100, s’ha de mostrar un missatge:
 * "Invalid discount percentage." i es retorna el valor 0 al mètode
 * També s’ha de sobrecarregar calculateDiscount() per a què no accepti paràmetres i
 * retorni un descompte per defecte del 10%.
 *
 * També es demana crear dues classes filles:
 *
 * - Book.java, amb un atribut addicional String author.
 *   · Dos constructors (un amb autor i un sense — s'assigna "Unknown").
 *   · Si l'autor és nul o buit, s’ha de mostrar "Author name cannot be empty." i s’ha d’assignar "Unknown" com a valor.
 *   · El mètode toString() ha de retornar exactament:
 *     <id> - <name>: <price>€ - Author: <author>
 *
 * - Electronic.java, amb un atribut addicional int warrantyMonths.
 *   · Dos constructors (un amb warrantyMonths i un sense — s'assigna 0).
 *   · Si la garantia és negativa, mostrar "Warranty cannot be negative." y se devuelve el * * *    valor 0 al método.
 *   · El mètode displayWarranty() ha de retornar:
 *     "This product has a warranty of <warrantyMonths> months."
 *   · El mètode toString() ha de retornar exactament:
 *     <id> - <name>: <price>€ - Warranty: <warrantyMonths> months
 *
 * Exemple:
 * Product p = new Product(1, "Tablet", 300.0);
 * System.out.println(p.calculateDiscount());     // 30.0
 * System.out.println(p.calculateDiscount(20));   // 60.0
 * System.out.println(p.calculateDiscount(-5));   // Missatge: Invalid discount percentage.
 * System.out.println(p.calculateDiscount(150));  // Missatge: Invalid discount percentage.
 *
 * Book b = new Book(2, "1984", 20.0, "George Orwell");
 * Book b2 = new Book(3, "Somehow, Somewhere", 18.5);
 * System.out.println(b);
 * System.out.println(b2);
 * // Sortida:
 * // 2 - 1984: 20.0€ - Author: George Orwell
 * // 3 - Somehow, Somewhere: 18.5€ - Author: Unknown
 *
 * Electronic e = new Electronic(4, "Smartphone", 300.0, 0);
 * Electronic e2 = new Electronic(5, "Monitor", 150.0, 12);
 * System.out.println(e.displayWarranty());
 * System.out.println(e2.displayWarranty());
 * System.out.println(e2);
 * // Sortida:
 * // This product has a warranty of 0 months.
 * // This product has a warranty of 12 months.
 * // 5 - Monitor: 150.0€ - Warranty: 12 months
 *
 * Provar valors no vàlids:
 * Book b3 = new Book(6, "", -10, "");
 * // Missatges:
 * // Product name cannot be empty.
 * // Price cannot be negative.
 * // Author name cannot be empty.
 *
 * Electronic e3 = new Electronic(7, "", -5.0, -2);
 * // Missatges:
 * // Product name cannot be empty.
 * // Price cannot be negative.
 * // Warranty cannot be negative.
 *
 *
 * Ejercicio 3 Tema 3
 *
 * Se pide crear una jerarquía de clases para representar productos de una tienda.
 *
 * La clase principal debe ser Product, que contiene tres atributos privados:
 * un identificador numérico (int id), el nombre del producto (String name) y el precio (double price).
 * El constructor debe permitir inicializar estos atributos.
 * Si el nombre es nulo o vacío, se debe mostrar "Product name cannot be empty."
 * Si el precio es negativo, se debe mostrar "Price cannot be negative."
 * También deben implementarse los métodos get y set para cada atributo
 * y un método calculateDiscount(double porcentaje).
 * Si el porcentaje es inferior a 0 o superior a 100, se debe mostrar un mensaje:
 * "Invalid discount percentage."
 * También se debe sobrecargar calculateDiscount() para que no reciba parámetros y
 * devuelva un descuento por defecto del 10%.
 *
 * También se deben crear dos clases hijas:
 *
 * - Book.java, con un atributo adicional String author.
 *   · Dos constructores (uno con autor y uno sin — se asigna "Unknown").
 *   · · Si el autor es nulo o vacío, mostrar "Author name cannot be empty." y asignar "Unknown" como valor por defecto.
 *   · El método toString() debe devolver exactamente:
 *     <id> - <name>: <price>€ - Author: <author>
 *
 * - Electronic.java, con un atributo adicional int warrantyMonths.
 *   · Dos constructores (uno con warrantyMonths y otro uno sin —  se asigna 0).
 *   · Si la garantía es negativa, mostrar "Warranty cannot be negative."
 *   · El método displayWarranty() debe devolver:
 *     "This product has a warranty of <warrantyMonths> months."
 *   · El método toString() debe devolver exactamente:
 *     <id> - <name>: <price>€ - Warranty: <warrantyMonths> months
 *
 * Exemplo:
 * Product p = new Product(1, "Tablet", 300.0);
 * System.out.println(p.calculateDiscount());     // 30.0
 * System.out.println(p.calculateDiscount(20));   // 60.0
 * System.out.println(p.calculateDiscount(-5));   // Missatge: Invalid discount percentage.
 * System.out.println(p.calculateDiscount(150));  // Missatge: Invalid discount percentage.
 *
 * Book b = new Book(2, "1984", 20.0, "George Orwell");
 * Book b2 = new Book(3, "Somehow, Somewhere", 18.5);
 * System.out.println(b);
 * System.out.println(b2);
 * // Salida:
 * // 2 - 1984: 20.0€ - Author: George Orwell
 * // 3 - Somehow, Somewhere: 18.5€ - Author: Unknown
 *
 * Electronic e = new Electronic(4, "Smartphone", 300.0, 0);
 * Electronic e2 = new Electronic(5, "Monitor", 150.0, 12);
 * System.out.println(e.displayWarranty());
 * System.out.println(e2.displayWarranty());
 * System.out.println(e2);
 * // Sortida:
 * // This product has a warranty of 0 months.
 * // This product has a warranty of 12 months.
 * // 5 - Monitor: 150.0€ - Warranty: 12 months
 *
 * Probar valores no vàlidos:
 * Book b3 = new Book(6, "", -10, "");
 * // Missatges:
 * // Product name cannot be empty.
 * // Price cannot be negative.
 * // Author name cannot be empty.
 *
 * Electronic e3 = new Electronic(7, "", -5.0, -2);
 * // Mensajes:
 * // Product name cannot be empty.
 * // Price cannot be negative.
 * // Warranty cannot be negative.
 */
public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        // TODO: initialize attributes using setters
    }

    public void setId(int id) {
        // TODO: assign id
    }

    public void setName(String name) {
        // TODO: print "Product name cannot be empty." if name is null or empty
        // otherwise assign the value
    }

    public void setPrice(double price) {
        // TODO: print "Price cannot be negative." if price < 0
        // otherwise assign the value
    }

    public int getId() {
        // TODO: return id
      
    }

    public String getName() {
        // TODO: return name
     
    }

    public double getPrice() {
        // TODO: return price
     
    }

    public double calculateDiscount(double percent) {
        // TODO: if percent is invalid, print "Invalid discount percentage." and return 0
        // else return the discount amount
      
    }

    public double calculateDiscount() {
        // TODO: call calculateDiscount with 10% as default
     
    }

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    /*
    public static void main(String[] args) {
        Product p = new Product(1, "Tablet", 300.0);
        System.out.println("Default discount: " + p.calculateDiscount());
        System.out.println("20% discount: " + p.calculateDiscount(20));
        System.out.println("Invalid (-5): " + p.calculateDiscount(-5));
        System.out.println("Invalid (150): " + p.calculateDiscount(150));

        Book b = new Book(2, "1984", 20.0, "George Orwell");
        Book b2 = new Book(3, "Somehow, Somewhere", 18.5);
        System.out.println(b);
        System.out.println(b2);

        Electronic e = new Electronic(4, "Smartphone", 300.0, 0);
        Electronic e2 = new Electronic(5, "Monitor", 150.0, 12);
        System.out.println(e.displayWarranty());
        System.out.println(e2.displayWarranty());
        System.out.println(e2);

        Book b3 = new Book(6, "", -10, "");
        Electronic e3 = new Electronic(7, "", -5.0, -2);
    }
    */
    // Re-comment this main if you want to run Maven tests (mvn test)
    // -------------------------------------------------------------
}


    // -------------------------------------------------------------
    // Test manual per a probar amb l'IDE
	// Test manual para probar con el IDE
    // -------------------------------------------------------------
	/*
	    public static void main(String[] args) {
        Product p = new Product(1, "Tablet", 300.0);
        System.out.println("Default discount: " + p.calculateDiscount());
        System.out.println("20% discount: " + p.calculateDiscount(20));
        System.out.println("Invalid (-5): " + p.calculateDiscount(-5));
        System.out.println("Invalid (150): " + p.calculateDiscount(150));

        Book b = new Book(2, "1984", 20.0, "George Orwell");
        Book b2 = new Book(3, "Somehow, Somewhere", 18.5);
        System.out.println(b);
        System.out.println(b2);

        Electronic e = new Electronic(4, "Smartphone", 300.0, 0);
        Electronic e2 = new Electronic(5, "Monitor", 150.0, 12);
        System.out.println(e.displayWarranty());
        System.out.println(e2.displayWarranty());
        System.out.println(e2);

        Book b3 = new Book(6, "", -10, "");
        Electronic e3 = new Electronic(7, "", -5.0, -2);
    }
    */
	// Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
}
