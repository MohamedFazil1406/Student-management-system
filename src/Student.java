public class Student {
    private long id;
    private String name;
    private int age;
    private String course;
    private double marks;

   public Student(long id,String name,int age,String course,double marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;

    }

    public void setId(Long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;

    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public String getCourse(){
        return course;
    }

    public void setMarks(double marks)
        {
        this.marks = marks;
        }

        public double getMarks()
        {
        return marks;
        }

        @Override
        public String toString(){
            return "Student detail: "+id+name+age+course+marks;
        }

}