/*
 * Exercici 2 Tema 3
 *
 * Es demana crear dues classes. La primera és la classe principal anomenada Employee.
 * Aquesta classe conté tres atributs privats: un identificador numèric (int id),
 * el nom de l’empleat (String name) i el salari (double salary).
 * El constructor ha de permetre inicialitzar aquests atributs. Si el nom és nul o buit, 
 * s’ha de mostrar el missatge per la sortida estàndar "Name cannot be empty.".
 * Si el salari és negatiu, s’ha de mostrar "Salary cannot be negative.".
 * A més, s’ha d’afegir un bloc d’inicialització d’instància que mostri "New employee created." quan la classe es creada.
 * També s’han d’implementar els mètodes get i set per a cada atribut.
 * 
 * La segona classe és Developer, que hereta d’Employee. 
 * Aquesta afegeix un atribut addicional privat de tipus String anomenat language.
 * El constructor ha de rebre els quatre atributs, invocar el constructor d’Employee amb super,
 * i validar que l'atribut language no sigui nul ni buit, mostrant en aquest cas
 * "Programming language cannot be empty." per la sortida estàndar.
 * 
 * El mètode toString() de Developer ha de retornar el següent: 
 * Developer: <id>, Name: <name>, Salary: <salary>€, Language: <language>
 *
 * Exemple:
 * Developer d = new Developer(1, "Laura", 3000.0, "Java");
 * System.out.println(d);
 * // Sortida:
 * // New employee created.
 * // Developer: 1, Name: Laura, Salary: 3000.0€, Language: Java
 * d.setName("");
 * d.setSalary(-500);
 * d.setLanguage("");
 * // Missatges per consola:
 * // Name cannot be empty.
 * // Salary cannot be negative.
 * // Programming language cannot be empty.
 *
 * ------------------------------------------------------------------
 *
 * Ejercicio 2 Tema 3 
 *
 * Se pide crear dos clases. La primera es la clase principal llamada Employee.
 * Esta clase contiene tres atributos privados: un identificador numérico (int id),
 * el nombre del empleado (String name) y el salario (double salary).
 * El constructor debe permitir inicializar estos atributos. Si el nombre es nulo o vacío,
 * debe mostrarse "Name cannot be empty." en la salida estándar.
 * Si el salario es negativo, debe mostrarse "Salary cannot be negative.".
 * Además, debe incluirse un bloque de inicialización de instancia que muestre
 * "New employee created."  cuando la clase es creada.
 * También deben implementarse los métodos get y set para cada atributo.
 * 
 * La segunda clase es Developer, que hereda de Employee.
 * Esta añade un atributo privado adicional de tipo String llamado language.
 * El constructor debe recibir los cuatro atributos, invocar el constructor de Employee con super,
 * y validar que el atributo language no sea nulo ni vacío, mostrando en ese caso
 * "Programming language cannot be empty." en la salida estándar.
 * 
 * El método toString() de Developer debe devolver:
 * Developer: <id>, Name: <name>, Salary: <salary>€, Language: <language>
 *
 * Ejemplo:
 * Developer d = new Developer(1, "Laura", 3000.0, "Java");
 * System.out.println(d);
 * // Salida:
 * // New employee created.
 * // Developer: 1, Name: Laura, Salary: 3000.0€, Language: Java
 * d.setName("");
 * d.setSalary(-500);
 * d.setLanguage("");
 * // Mensajes por consola:
 * // Name cannot be empty.
 * // Salary cannot be negative.
 * // Programming language cannot be empty.
 */

public class Employee {

    // Private attributes: id, name, salary
    private int id;
    private String name;
    private double salary;

    // Initialization block: print "New employee created."
    {
        // TODO: print "New employee created."
    }

    // Constructor: initialize id, name, salary
    // Use 'this' for id and call setters for name and salary
    public Employee(int id, String name, double salary) {
        // TODO: assign id
        // TODO: call setName(name)
        // TODO: call setSalary(salary)
    }

    // Getter for id
    public int getId() {
        // TODO: return id
        return 0;
    }

    // Setter for id
    public void setId(int id) {
        // TODO: assign value to this.id
    }

    // Getter for name
    public String getName() {
        // TODO: return name
        return null;
    }

    // Setter for name
    // If null or empty, print "Name cannot be empty."
    public void setName(String name) {
        // TODO: validate and assign name
    }

    // Getter for salary
    public double getSalary() {
        // TODO: return salary
        return 0.0;
    }

    // Setter for salary
    // If salary is negative, print "Salary cannot be negative."
    public void setSalary(double salary) {
        // TODO: validate and assign salary
    }

 // -------------------------------------------------------------
    // Test manual per a provar a l'IDE
	// Test manual para probar con el IDE
    // -------------------------------------------------------------
    /*
    public static void main(String[] args) {
        Developer d = new Developer(1, "Laura", 3000.0, "Java");
        System.out.println(d);
        d.setName("");
        d.setSalary(-500);
        d.setLanguage("");
    }
    */
    // Torna a comentar aquest main quan vulguis executar els tests amb:
    // mvn test
	// Vuelve a comentar este main cuando quieras ejecutar los tests con:
	// mvn test
    // -------------------------------------------------------------
}
