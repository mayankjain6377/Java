class Laptop{
    public void code()
    {
        System.out.println("code compiile ..run");
    }
}
class Developer{
    public void devApp()
    {
        System.out.println("coding...");
    }
}

public class java6_interface {
    public static void main(String[] args) {
        Laptop lp=new Laptop();
         Developer obj=new Developer();
         obj.devApp();
    }
}
