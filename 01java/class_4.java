import java.util.Scanner;
 class multi{
    Scanner sc=new Scanner(System.in);

int getdata(int [][][] arr)
{
    System.out.println("taking input of 3 D array");
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j <arr[i].length; j++) {
        for (int k = 0; k < arr[i][j].length; k++) {
    
 arr[i][j][k]=sc.nextInt();

    }
}
    }
    return 0;
}

int putdata(int [][][] arr)
{
    System.out.println("3 dimensional array");
    for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j <arr[i].length; j++) {
    for (int k = 0; k < arr[i][j].length; k++) {

 System.out.println(arr[i][j][k] + " ");

    }
System.out.println();
}
System.out.println();

    }
    return 0;
}
 } 
public class class_4 {

    public static void main(String[] args)
    {
        int arr[][][]=new int[3][3][2];
        // Scanner sc=new Scanner(System.in);
multi obj=new multi();
obj.getdata(arr);
obj.putdata(arr);
    }
}