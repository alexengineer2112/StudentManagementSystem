import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> ls = new ArrayList<>();
        int choice;
        do{
        System.out.println("1)Adding the student details");
        System.out.println("2)Remove the student details from the index");
        System.out.println("3)Showing all the student details");
        System.out.println("4)Exit");

        System.out.print("Enter your choice:");
         choice = sc.nextInt();
         sc.nextLine();

            switch(choice){

                case 1:System.out.println("Enter the name:");
                        String name = sc.nextLine();

                       System.out.println("Enter the Age:");
                        int age = sc.nextInt();
                        sc.nextLine();

                       System.out.println("Enter the CGPA:");
                        double cgpa = sc.nextDouble();
                        sc.nextLine();

                    ls.add(new Student(name, age, cgpa));
                    System.out.println("Student Details Added"); 
                    break;
                
                case 2:System.out.println("Enter the index for which the student details needs to be removed");
                        int index = sc.nextInt();
                        if(index >=0 && index < ls.size())
                        {
                            ls.remove(index);
                        }
                        else
                        {
                            System.out.println("Invalid Index");
                        }
                        break;
                
                case 3:System.out.println("Student details Are:");
                        for(int i=0;i<ls.size();i++)
                        {
                            Student st = ls.get(i);
                            System.out.println(i+1+":"+ st.name+ "|"+ st.age +"|"+st.cgpa);
                        }
                        break;
                case 4:System.out.println("Exit");
                        break;

                default:
                    System.out.print("Inavlid choice");
                    break;
            }
        }while(choice!=4);
        sc.close();
    }
}
