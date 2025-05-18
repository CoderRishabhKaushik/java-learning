public class MethodExample {

    // Static method
    public static void greet() {
        System.out.println("Hello from static method!");
    }

    // Non-static method
    public void sayName(String name) {
        System.out.println("Your name is: " + name);
    }

    // Main method (also static)
    public static void main(String[] args) {

        // Call static method directly — no object needed
        greet();

        // Create object to call non-static method
        MethodExample obj = new MethodExample();
        obj.sayName("Rishabh");
    }
}
