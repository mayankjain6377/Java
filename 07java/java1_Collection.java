// package 07java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class java1_Collection {
    public static void main(String[] args) {
        // Collection <Integer> nums =new ArrayList<Integer>();
        // List <Integer> nums =new ArrayList<Integer>();
        // Collection <Integer>nums=new TreeSet<Integer>();
        Set <Integer>nums=new TreeSet<Integer>();

        nums.add(80);
        // nums.add("mayank");
        nums.add(113);
        nums.add(14);
        // nums.add(48);
        Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        
        for(int i=0;i<4;i++)
        {

            nums.add(sc.nextInt());
        }

        // for(int i=0;)

        // System.out.println(nums.get(2));
        // System.out.println(nums.sort<Integer>);
        // System.out.println(nums.toArray);

        // System.out.println("Sorted array is ");
    //  for (Object n : nums) {
    //     // int n=(Integer)n;
    //      System.out.print("  "+n);
    //  }

         Iterator<Integer> values=   nums.iterator();
System.out.println("mayank jain");
         while (values.hasNext()) {
            
             System.out.println(values.next());
            }

    }
}
