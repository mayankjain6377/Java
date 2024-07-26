interface A{
    int age=12;
     void show();
}
interface B {
    String name="mayank";
    void nameShow();
    
}  
interface C extends A,B {
    char ch='A';
    void letter();
}
class Demo implements C{

    public void show(){
         System.out.println("in show" +age);
    }
    public void nameShow()
    {
        System.out.println(name);
    }
   public void letter()
   {
    System.out.println(ch);
   }
}

public class java5_interface {
    public static void main(String[] args) {
         Demo obj=new Demo();
        obj.show();
        obj.nameShow();
        obj.letter();
        System.out.println(A.age);
    }
}
