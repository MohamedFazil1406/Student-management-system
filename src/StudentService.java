import java.util.ArrayList;


public class StudentService {

    public ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added SuccessFully");
    }

    public void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No students found");
            return;
        }
        for(Student s:students){
            System.out.println("ID:"+s.getId()+", Name:"+s.getName()+", Age:"+s.getAge());
        }
    }

    public Student findStudentById(long id){
        for(Student s:students){
            if(s.getId()==id){
                return s;
            }
        }
        return null;
    }

    public boolean updateStudent(long id, String name, int age) {
        Student student = findStudentById(id);
        if (student != null) {
            student.setName(name);
            student.setAge(age);
            return true;
        }
        return false;
    }


    public boolean deleteStudent(long id) {
        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }



}