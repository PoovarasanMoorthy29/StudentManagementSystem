package StudentManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("<-..Welcome..->");
        Scanner get=new Scanner(System.in);
        StudentDAO dao=new StudentDAO();

        while(true){

            System.out.println("1.Add student");
            System.out.println("2.Update Student");
            System.out.println("3.View all Student");
            System.out.println("4.Delete a student");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            int choice=get.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Enter student id:");
                    int id=get.nextInt();
                    System.out.println("Enter student name:");
                    String name=get.next();
                    System.out.println("Enter student age:");
                    int age=get.nextInt();
                    System.out.println("Enter student grade:");
                    String grade=get.next();

                    Student s=new Student(id,name,age,grade);
                    dao.Add(s);
                    break;

                case 2:

                    System.out.println("Enter student id:");
                    int uid=get.nextInt();
                    System.out.println("Enter student name:");
                    String uname=get.next();
                    System.out.println("Enter student age:");
                    int uage=get.nextInt();
                    System.out.println("Enter student grade:");
                    String ugrade=get.next();

                    dao.update(uid,uname,uage,ugrade);
                    break;

                case 3:

                    dao.viewAll();
                    System.out.println("\n");
                    break;

                case 4:

                    System.out.println("Enter the id:");
                    int did=get.nextInt();
                    dao.delete(did);
                    break;

                case 5:

                    System.out.println("Exiting ");
                    return;
            }
        }

    }
}
