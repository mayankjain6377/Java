class human {
    String name;
    int age;

    public human() {
        System.out.println("in default constructor");
    }
    public human(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("in parameterized constructor");
        // System.out.println(this.name);
    }

public human(human person) {
    this.name = person.name;
    this.age = person.age;
    System.out.println("copy construrr");
    System.out.println(this.name+":"+this.age);
}



}

public class java_3constructor {
    public static void main(String[] args) {
        // human obj1=new human();
        // human obj2= new human(21, "mayank");
        // human obj3=new human (obj2);
    }
}







// class Complex {
//     private double re, im;
//     public Complex(double re, double im)
//     {
 
//         // this keyword refers to current instance itself
//         this.re = re;
//         this.im = im;
//     }
//     Complex(Complex c)
//     {
 
//         System.out.println("Copy constructor called");
 
//         re = c.re;
//         im = c.im;
//     }
//     @Override public String toString()
//     {
//         return "(" + re + " + " + im + "i)";
//     }
// }
// public class Main {
//     public static void main(String[] args)
//     {
//         Complex c1 = new Complex(10, 15);
//         Complex c2 = new Complex(c1);
//         Complex c3 = c2;
//         System.out.println(c2);
//     }
// }




// Define a class
class Person {
    String name;
    int age;

    // Regular constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    // Method to display the person's details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create an object using regular constructor
        Person p1 = new Person("John", 25);

        // Create a copy of the object using the copy constructor
        Person p2 = new Person(p1);

        // Display details of both objects
        p1.display();  // Output: Name: John, Age: 25
        p2.display();  // Output: Name: John, Age: 25
    }
}
