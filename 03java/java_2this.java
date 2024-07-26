
class human {
    private int age;
    private String name ;
    
    
    public void setage(int age)
    {
        // human obj1=new human();
    this.age=age;
    }
    public int getage()
    {
        return age;
    
    }
    public void setname(String name )
    {
        this.name=name;
    
    }
    public String getname()
    {
        return name;
    
    }
    }
    
    
public class java_2this {
    public static void main(String[] args) {
        human obj=new human();
        // obj.age=9;
        // obj.name="mayank ";
        obj.setage(2);
        obj.setname("mayank");
        
       
        System.out.println( obj.getname()+" : "+obj.getage());
    }
}
