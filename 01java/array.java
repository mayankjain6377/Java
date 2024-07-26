import java.util.*;

 class max{
     void maxx(int[] arr){
    int max=0;
for(int i=0;i<arr.length;i++)
{
    
    if(arr[i]>max){
max=arr[i];
}
    
}
System.out.println("the max value is "+max);

    }
}
class min{

  void minn(int [] arr)
    {
        int min=32786;
for(int i=0;i<arr.length;i++)
{
    
    if(arr[i]<min){
min=arr[i];
}
    
}
System.out.println("the min value is "+min);

    }

}
public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int[] num={1,2,3,55,43,2};

        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("printing the max of array");
        max obj=new max();
        obj.maxx(arr);
        min obj2=new min();
        obj2.minn(arr);
        // obj2.maxx(arr);
        // obj2.min();
        // for( int i=num.length; i<0; i--)
        // {
        // System.out.println(num[i]);
        // }
        sc.close();
    }

}
