import com.kayz.javase.entity.Course;
import com.kayz.javase.entity.Student;

public class Main{
    public static void main(String[] args) {
        Student s = new Student("Alex","man", 20,"IS");
        s.study(Course.PE);
        s.message("What the fuck?");
    }
}