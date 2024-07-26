import java.util.Scanner;

class multi_array{
    Scanner sc=new Scanner(System.in);
    int count =1;
    void getdata(int [][] arr)

    {
        for(int i=0;i<arr.length;i++)
        {
        for(int j=0;j<arr.length;j++)
        {
        // System.out.pr53intln("enter " +(count)+ " element of matrix ");
    //   arr[i][j]= sc.nextInt();
    arr[i][j]=(int)(Math.random()*100);
      count++;

        }
            
        }

    }
    void putdata(int [][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
        for(int j=0;j<arr.length;j++)
        {
        // System.out.println("enter " +(i+j)+ "element of matrix ");
    //   arr[i][j]= sc.nextInt();
    System.out.print(arr[i][j] +"  ");

        }
System.out.println();
            
        }

    }


    void find(int [][] arr)
    {
        System.out.println("enter a value which you want to find");
int value=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {

if (arr[i][j]==value) {
    System.out.println("elenmnt found at " +(i+1)+","+(j+1));
break;
}
else 
System.out.println("elemnt not found");
        }
        }
      
    }
}


public class class_3array {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
int arr[][]=new int [3][3];
System.out.println("enter the values of matrix ");
 multi_array obj=new multi_array();
 obj.getdata(arr);
 obj.putdata(arr);

obj.find(arr);
sc.close();
    }
    
}
