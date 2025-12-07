import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n--- STUDENT MANAGEMENT ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Sort by Marks");
            System.out.println("6. Sort by Name");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    students.add(new Student(name, age, marks));
                    System.out.println("Student added!");
                    break;

                case 2:
                    System.out.println("\n--- All Students ---");
                    for (Student s : students) {
                        System.out.println(s.name + " | " + s.age + " | " + s.marks);
                    }
                    break;

                case 3:
                    System.out.print("Enter index to delete: ");
                    int index = sc.nextInt();
                    if(index >= 0 && index < students.size()) {
                        students.remove(index);
                        System.out.println("Student deleted!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to search: ");
                    String key = sc.nextLine();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.name.equalsIgnoreCase(key)) {
                            System.out.println("Found: " + s.name + " | " + s.age + " | " + s.marks);
                            found = true;
                        }
                    }

                    if (!found) System.out.println("Student not found!");
                    break;

                case 5:
                    students.sort((s1, s2) -> s1.marks - s2.marks);
                    System.out.println("Sorted by Marks!");
                    break;

                case 6:
                    students.sort((s1, s2) -> s1.name.compareTo(s2.name));
                    System.out.println("Sorted by Name!");
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 7);

        sc.close();
    }
}
