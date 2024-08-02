package classroomprogram;

public class Poly1 {
    private String name;
    public int age;
    protected String address;

    public Poly1(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Poly2 extends Poly1 {
    public Poly2(String name, int age, String address) {
        super(name, age, address);
    }

    public void printDetails() {
        super.printDetails();
    }

    public static void main(String[] args) {
        Poly2 poly2 = new Poly2("ganesh", 21, "banglore");
        poly2.printDetails();
    }
}