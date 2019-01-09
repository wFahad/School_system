package school_system;

/**
 *
 * @author 1507278
 */
import java.util.*;
import java.io.*;

public class manager extends Person {

    public Person students[] = new student[2];
    int index = 0;
    static Scanner input = new Scanner(System.in);
//    private static Object toString;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("school system.txt");
        PrintWriter out = new PrintWriter(file);

        Scanner s = new Scanner("course.txt");

        int age = 16;

//       addCourse( s , age );
        //    Scanner in = new Scanner(file);
//        
//        String name ;
//        int id, phone;
//        String adress;
//        String email ;
//        
//      
//            System.out.println("enter ");
//             name = input.next();
//            id = input.nextInt();
//            phone = input.nextInt();
//            adress = input.next();
//            email = input.next();
//       AddStudent( out, name, id, phone, adress, email);
        out.close();
    }

    public manager() {
        super();
    }

    public manager(String Name, int national_ID, int age, int Phone_number, String Address, String Email) {
        super(Name, national_ID, age, Phone_number, Address, Email);
    }

    /* public String toString() {
        return 
    }*/
    public void AddStudent(PrintWriter out, String name, int id, int age, int phone, String adress, String email) {

        student s = new student(name, id, age, phone, adress, email);

        students[index] = s;
        out.println(students[index].toString());
        index++;

        //       return students;
    }

    public String add() {
        String name = students[index].getName();
        index++;
        return name;
    }

    public void addCourse(Scanner read, int age, PrintWriter out) {
        String sub;

        try {
            for (int j = 0; j < 3; j++) {
                sub = read.nextLine();
                out.println(sub);
            }
        } catch (Exception e) {
            System.out.println("nmmmmmm ");

        }

        read.close();

    }

    /////////////////
    public int checkname() {
        String n = "";
        for (char c : n.toCharArray()) {
            if (Character.isDigit(c)) {
                return 1;
            }
        }
        return 0;
    }

    public void checkPhoneDiget() {
        String p[] = {"78", "lk,"};

//        if (p.length() = 2);
//        
//        for (int i = 0; i < 10; i++) {
//            
//          if()  
//        }
        // ph.
        //}
    }

    public int checkAge() {
        int age = 0;
        if (age < 12) {
            return 1;

        }
        return 0;

    }

    public int checkAddCourse() {
        String number_course = "math";
        String cousre_taken = "phy";
        if (!number_course.equals(cousre_taken)) {
            return 1;
        }
        return 0;
    }

    public int checkMaxCourse() {
        int number_course = 6;
        if (number_course > 4) {
            return 0;
        }
        return 1;
    }

    public int checkAddStudent() {
        String student = "math";
        String new_student = "phy";
        if (student.equals(new_student)) {
            return 0;
        }
        return 1;
    }

}
