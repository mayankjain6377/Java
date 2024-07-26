import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class java2_map {
    public static void main(String[] args) {
        Map<String,Integer>students=new Hashtable <>();
        students.put("mayank", 89);
        students.put("Sumit", 88);
        students.put("khushi", 98); 
        students.put("akash", 100);
        students.put("akash", 10);
        System.out.println(students);

        for(String name:students.keySet()){
            System.out.println(name+" : "+students.get(name));

        }


    }

}
