class A{
    public void show() throws ClassNotFoundException
    {
        System.out.println();
        Class.forName("demo");

    }
}


public class java4_throws {
    public static void main(String[] args)  {
        
        A obj=new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {

            // ();
        }
        finally{
            
        }

    }
    
}
