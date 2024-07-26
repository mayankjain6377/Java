class student {

    int roll_no;
    String name ;
//    static String name ;
    int marks;

// static{
  
//     name ="ewew";
//     System.out.println("in static block.... ");
// }

 public student (){
roll_no =41;
marks=222;
name="ewew";
 }
}

public class array1{
    public static void main (String [] args)
    {
student s1=new student();
s1.roll_no=21;
s1.name="mayank";
s1.marks=90;

student s2=new student();
s2.roll_no=22;
s2.name="sumit";
s2.marks=89;

student s3=new student();
s3.roll_no=23;
s3.name="akash";
s3.marks=91;


student arr[]=new student[3];
arr[0]=s1;
arr[1]=s2;
arr[2]=s3;
for(int i =0;i<arr.length;i++)
{
    // System.out.println(s1.name);
}
s1.name="kk";
System.out.println(s2.name);
    }
}