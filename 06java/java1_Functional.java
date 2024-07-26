// package 06java;
//functional interface is a interface which has only one method 
@FunctionalInterface
interface A{
    int add(int num1,int num2)  ;
}

public class java1_Functional {
    public static void main(String[] args) {
        A obj = (num1,num2) ->{
            int result=num1+num2;
            System.out.println("show method : " +result );
            return num1+num2;
        };
        int result=  obj.add(3,4);
    }
    
}
