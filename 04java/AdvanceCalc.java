
public class AdvanceCalc extends Calc{
    // AdvanceCalc  obj=new AdvanceCalc();
    int multi(int num1,int num2)
    {
        return num1*num2;
    }
    int div(int num1,int num2)
    {
        return num1/num2;
    }
    double pow(double num1,double num2)
    {
        return Math.pow(num1, num2);
    }
    public static void main(String[] args) {
        
        AdvanceCalc obj=new AdvanceCalc();
        int temp= obj.add(2,3);
        System.out.println(temp);
         int temp2 =obj.sub(6,8);
         System.out.println(temp2);
       int temp3= obj.multi(3,2);
       System.out.println(temp3);
       int temp4= obj.div(10,2);
       System.out.println(temp4);
double temp5=obj.pow(temp3, temp4);
System.out.println(temp5);
    }
}
