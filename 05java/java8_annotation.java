class A{
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
public class java8_annotation {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
}
