// package 05java;
//this is the example of dynamic dispatch means there is 3 obj which access same show() method 
class A {
    public void show()
    {
        System.out.println("in A show");
    }
}
class B extends A{
    public void show()
    {
    System.out.println("in B show");

    }
}
class C extends A{
    public void show()
    {
    System.out.println("in c show");

    }
}


public class java1_polymorphism {

  public static void main(String[] args) {
    A obj =new A();
    obj.show();
    new B().show();
    new C().show();
  }
    
}
