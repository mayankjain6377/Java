
public class string{
    public static void main(String[] args) {
        
        //immutable string

        // String str="mayank ";
        // System.out.println(str);
        // str=str+"jain";
        // System.out.println(str);
        // str=str+"mayank";
        // System.out.println(str);

        // String buffer concept
        StringBuffer sb=new StringBuffer("mayank ");
        // sb.append("mayank"); 
        sb.insert(0,"code with ");
        System.out.println(sb);


    }
}
