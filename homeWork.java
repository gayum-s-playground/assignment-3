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

        }
        
        printLabel:
        {
            System.out.println("-".repeat(60));
        }
    }
}