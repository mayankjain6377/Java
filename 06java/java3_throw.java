import java.util.Scanner;

public class java3_throw {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int result;
                try {
            int num1=sc.nextInt();
            int num2=sc.nextInt();
                 result=num1/num2;
                
                if (num2==0) {
                    throw new ArithmeticException("trying to divide by zero");
                    
                }

        } catch (Exception e) {
                System.out.println("something is wrong");

        }
        System.out.println("answer is " );

    }
}
