class A{
    void add ()
    {
System.out.println("Add ");
    }
}
class B extends A {
    void add()
    {
System.out.println("Add and sub");


    }

}

public class java2_types extends B{
    public static void main(String[] args) {
        
        // void add ()
        // {
        //     System.out.println("add and multi");
        // }
        java2_types obj=new java2_types();
        obj.add();
    }
}
