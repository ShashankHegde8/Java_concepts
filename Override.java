package classroomprogram;

// Parent class
class Parents {
    static int a = 10;
    public String s4 = "parent";
    protected String s2 = "protected";
    private String s3 = "private";

    void display() {
        String s1 = "hello from parent";
        System.out.println(s1);
    }
}

// Child class inheriting from Parent
class Childs extends Parents {
    void display() {
        super.display(); // Calls the display method of the parent class
        String s1 = "hello from child";
        System.out.println(s1);
        System.out.println(s4); // Accessing public member of parent class
        // System.out.println(s3); // Cannot access private member of parent class
        System.out.println(a); // Accessing static member of parent class
    }
}

// Grandchild class inheriting from Child
class Grandchild extends Childs {
 
    void display() {
        super.display(); // Calls the display method of the child class
        System.out.println("hello from grandchild");
    }
}

public class Override {
    public static void main(String[] args) {
        // Creating an instance of Grandchild and calling its display method
        Grandchild c1 = new Grandchild();
        c1.display();
    }
}
