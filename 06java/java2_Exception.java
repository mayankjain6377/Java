import java.util.Scanner;

public class java2_Exception {
    public static void main(String[] args) {
        // int num1=8;
        // int num2=0;
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int arr[]=new int[5];
        String str=null;
        try {
            int result=num1/num2;
            System.out.println(result);
            System.out.println(arr[1]);
            // System.out.println(arr[5]);
            System.out.println(str.length());
            
        // } catch (ArithmeticException e) {
        } catch (ArithmeticException e) {

            System.out.println("you are trying to divide byb Zero  " +e);
        }
        
         catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Out of Bound Error  " +e);
        }
         catch (NullPointerException e) {

            System.out.println(" String is Out of Bound Error  " +e);
        }
        sc.close();

    }
}
