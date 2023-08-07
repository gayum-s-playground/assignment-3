import java.util.Scanner;
public class homeWork{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        programme:
        {
            System.out.print("Enter your name : ");
            String name = scanner.nextLine();
            String strippedName = name.strip();
            if(strippedName.length() <= 0) System.out.println("\033[31mInvalid Name!");
            if(strippedName.length() <= 0) break programme;

            System.out.print("Enter your age : ");
            int age = scanner.nextInt();
            if( age < 10 || age > 18 ) System.out.println("\033[31mInvalid Age!");
            if( age < 10 || age > 18 ) break programme;

            scanner.nextLine();

            System.out.print("Enter your subject 1 : ");
            String sub1 =scanner.nextLine();
            if(!sub1.startsWith("SE-")) System.out.println("\033[31mInvalid Subject code!");
            if(!sub1.startsWith("SE-")) break programme;

            System.out.print("Enter marks for Subject 1 : ");
            double marks1 = scanner.nextDouble();
            if( marks1<0 || marks1>100 ) System.out.println("\033[31mInvalid Marks!");
            if( marks1<0 || marks1>100 ) break programme;

            scanner.nextLine();

            System.out.print("Enter marks for Subject 2 : ");
            String sub2 =scanner.nextLine();
            if(!sub2.startsWith("SE-")) System.out.println("\033[31mInvalid Subject code!");
            if(!sub2.startsWith("SE-")) break programme;
            if(sub2.equals(sub1))System.out.println("\033[31mThis subject has been already added!");
            if(sub2.equals(sub1)) break programme;

            System.out.print("Enter marks for Subject 2 : ");
            double marks2 = scanner.nextDouble();
            if( marks2<0 || marks2>100 ) System.out.println("\033[31mInvalid Marks!");
            if( marks2<0 || marks2>100 ) break programme;

            scanner.nextLine();

            System.out.print("Enter marks for Subject 3 : ");
            String sub3 =scanner.nextLine();
            if(!sub3.startsWith("SE-")) System.out.println("\033[31mInvalid Subject code!");
            if(!sub3.startsWith("SE-")) break programme;
            if(sub3.equals(sub2) || sub3.equals(sub1))System.out.println("\033[31mThis subject has been already added!");
            if(sub3.equals(sub2) || sub3.equals(sub1)) break programme;

            System.out.print("Enter marks for Subject 3 : ");
            double marks3 = scanner.nextDouble();
            if( marks3<0 || marks3>100 ) System.out.println("\033[31mInvalid Marks!");
            if( marks3<0 || marks3>100 ) break programme;  

            double totalMarks = marks1 + marks2 + marks3;
            double avgMarks = totalMarks/3.0;
            String status;
            if(avgMarks >= 75.0) status = "\033[34;1mDistinguished Pass\033[0m\t\t\t\t\t\t\t";
            else if(avgMarks >= 65.0) status = "\033[32;1mCredit Pass\033[0m\t\t\t\t\t\t\t";
            else if(avgMarks >= 55.0) status = "\033[33;1mPass \033[0m\t\t\t\t\t\t\t\t"; 
            else status ="\033[31;1mFail\033[0m\t\t\t\t\t\t\t\t"; 
            
            String result1;
            if(marks1 >= 75.0) result1 = "\033[34;1mDistinguished Pass\033[0m\t";
            else if(marks1 >= 65.0) result1 = "\033[32;1mCredit Pass\033[0m\t\t";
            else if(marks1 >= 55.0) result1 = "\033[33;1mPass \033[0m\t\t\t"; 
            else result1 ="\033[31;1mFail\033[0m\t\t\t"; 

            String result2;
            if(marks2 >= 75.0) result2 = "\033[34;1mDistinguished Pass\033[0m\t";
            else if(marks2 >= 65.0) result2 = "\033[32;1mCredit Pass\033[0m\t\t";
            else if(marks2 >= 55.0) result2 = "\033[33;1mPass \033[0m\t\t\t"; 
            else result2 ="\033[31;1mFail\033[0m\t\t\t"; 

            String result3;
            if(marks3 >= 75.0) result3 = "\033[34;1mDistinguished Pass\033[0m\t";
            else if(marks3 >= 65.0) result3 = "\033[32;1mCredit Pass\033[0m\t\t";
            else if(marks3 >= 55.0) result3 = "\033[33;1mPass \033[0m\t\t\t"; 
            else result3 ="\033[31;1mFail\033[0m\t\t\t"; 
            
            String subjectCode1 = sub1.substring(3);
            String subjectCode2 = sub2.substring(3);
            String subjectCode3 = sub3.substring(3);

            
            String nameUpperCase = name.toUpperCase();

            System.out.println("+"+"-".repeat(79)+"+");
            System.out.println("|   Name : \033[34;1m" + nameUpperCase + "\033[0m\t\t\t\t\t\t\t\t|");
            System.out.printf("|   Age : %s years old \t\t\t\t\t\t\t\t|\n",age);
            System.out.printf("|   Status : %s|\n" , status);
            System.out.printf("|   Total : %.2f \t\t\t\t\t Avg : %.2f%s\t\t|\n",totalMarks,avgMarks,"%");
            System.out.println("+"+"-".repeat(79)+"+");
            System.out.println("|\tSubject\t\t|\tMarks\t\t|\tStatus\t\t\t|");
            System.out.printf("|\tSE-00%s\t\t|\t%.2f\t\t|\t%s|\n",subjectCode1,marks1,result1);
            System.out.println("+"+"-".repeat(79)+"+");
            System.out.printf("|\tSE-00%s\t\t|\t%.2f\t\t|\t%s|\n",subjectCode2,marks2,result2);
            System.out.println("+"+"-".repeat(79)+"+");
            System.out.printf("|\tSE-00%s\t\t|\t%.2f\t\t|\t%s|\n",subjectCode3,marks3,result3);
            System.out.println("+"+"-".repeat(79)+"+");

        }
        
    }
}