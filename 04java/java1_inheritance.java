 class Calc  {
   
        int add (int num1,int num2)
        {
            System.out.println(num1+num2);
            return num1+num2;
        }
        int sub (int num1,int num2)
        {
            System.out.println(num1-num2);
            return num1-num2;
        }
    
    
}

public class java1_inheritance extends Calc{
    public static void main(String[] args) {
       Calc obj=new Calc();
      int temp= obj.add(2,3);
      System.out.println(temp);
       int temp2 =obj.sub(6,8);
       System.out.println(temp2);

    }
}
