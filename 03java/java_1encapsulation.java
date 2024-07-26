class human {
private int age;
private String name ;


public void setage(int a)
{
age=a;
}
public int getage()
{
    return age;

}
public void setname(String n )
{
    name=n;

}
public String getname()
{
    return name;

}
}



public class java_1encapsulation{
    public static void main(String[] args) {
        human obj=new human();
        // obj.age=9;
        // obj.name="mayank ";
        obj.setage(21);
        obj.setname("mayank is your dad");
        
       
        System.out.println( obj.getname()+" : "+obj.getage());
    }
}
