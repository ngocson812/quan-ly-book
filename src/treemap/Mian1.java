package treemap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Mian1 {
    public static void main(String[] args) {
        Student student1 = new Student("Lilkang", 18, "Meo");
        Student student2 = new Student("LilNas", 19, "Meo");
        Student student3 = new Student("LilTapee", 20, "Meo");

        Map <Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put (1, student1);
        studentMap.put (2, student2);
        studentMap.put (3, student3);
        studentMap.put (4, student1);

        for(Map.Entry < Integer, Student > student  : studentMap.entrySet()){
            System.out.println("....... Set");
            Set <Student> students = new HashSet<Student>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student1);

            for(Student student4 : students){
                System.out.println(student.toString());
            }
        }
    }
}
