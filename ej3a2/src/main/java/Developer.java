public class Developer extends Employee {

    // Private attribute: language
    private String language;

    // Constructor: receives id, name, salary, and language
    // Calls the superclass constructor and sets the language
	
    public Developer(int id, String name, double salary, String language) {
        // TODO: call super constructor with id, name, salary
        // TODO: call setLanguage(language)
    }

    // Getter for language
    public String getLanguage() {
        // TODO: return language
        
    }

    // Setter for language
    // If language is null or empty, print "Programming language cannot be empty."
    public void setLanguage(String language) {
        // TODO: validate and assign language
    }

    // Override toString()
    // Return: Developer: <id>, Name: <name>, Salary: <salary>€, Language: <language>
    @Override
    public String toString() {
        // TODO: return formatted string
        
    }
}
