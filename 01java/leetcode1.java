import java.util.*;
class number {
    Scanner sc=new Scanner(System.in);
    public int sum(int [] nums){
        int target=sc.nextInt();
       for(int i=0;i<nums.length;i++){
        int temp=i+1;
        if(nums[i]+nums[temp]==target)
        {
            System.out.println(i + "," +(i+1));
        }
        // else 
        // System.out.println("no target found");
        // break;
       }

return 0;

    }
}


public class leetcode1{
    public static void main(String []args)
    {
        int [] nums={1,2,3,6,5};
        System.out.println("enter a value ");
        number obj=new number();
        obj.sum(nums);

    }
    
}