

public class java6_Threads {
    public static void main(String[] args) {
    int arr1[]={1,2,3};
    int arr2[]=new int [5];
    for (int i = 0; i < arr1.length; i++) {
  
          arr2[i]=arr1[i];
          
        
    
    }
    for (int index = 0; index < arr1.length; index++) {
      
      System.out.println(arr2[index]);
    }
    }
}
