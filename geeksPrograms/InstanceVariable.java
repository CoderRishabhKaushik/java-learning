class Person {
    String name;

    void sayName() {
        System.out.println("my name is " + name);
    }
}

public class InstanceVariable {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Rishabh";

        Person p2 = new Person();
        p2.name = "Riseev";

        p1.sayName();
        p2.sayName();

    }

}
