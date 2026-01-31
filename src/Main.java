public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        boolean running = true;

        while (running) {

            MenuUtil.showMenu();
            int choice = InputUtil.getInt("");

            switch (choice) {

                case 1:
                    long id = InputUtil.getLong("Enter Student ID: ");
                    String name = InputUtil.getString("Enter Name: ");
                    int age = InputUtil.getInt("Enter Age: ");
                    String course=InputUtil.getString("Enter Course name: ");
                    double marks=InputUtil.getDouble("Enter the marks: ");

                    Student student = new Student(id, name, age,course,marks);
                    studentService.addStudent(student);
                    break;

                case 2:
                    studentService.viewStudents();
                    break;

                case 3:
                    long searchId = InputUtil.getLong("Enter Student ID to search: ");
                    Student found = studentService.findStudentById(searchId);

                    if (found != null) {
                        System.out.println(
                                "ID: " + found.getId() +
                                        ", Name: " + found.getName() +
                                        ", Age: " + found.getAge()
                        );
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    long updateId = InputUtil.getLong("Enter Student ID to update: ");
                    String newName = InputUtil.getString("Enter New Name: ");
                    int newAge = InputUtil.getInt("Enter New Age: ");

                    if (studentService.updateStudent(updateId, newName, newAge)) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    long deleteId = InputUtil.getLong("Enter Student ID to delete: ");

                    if (studentService.deleteStudent(deleteId)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you. Exiting program.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
