public class tempPrint {
    public static void main(String[] args) {
        String name = "Gayum sasiri";
        int age = 15;
        double marks1 =10.34343;
        double marks2 =45.33343;
        double marks3 = 34.99434;
        String sub1 ="SE-1";
        String sub2 ="SE-2";
        String sub3 ="SE-3";





        double totalMarks = marks1 + marks2 + marks3;
        double avgMarks = totalMarks/3.0;
        String status;
        if(avgMarks >= 75.0) status = "\033[34;1mDistinguished Pass\033[0m\t\t\t\t\t\t\t";
        else if(avgMarks >= 65.0) status = "\033[32;1mCredit Pass\033[0m\t\t\t\t\t\t\t";
        else if(avgMarks >= 55.0) status = "\033[33;1mPass \033[0m\t\t\t\t\t\t\t\t"; 
        else status ="\033[31;1mFail\033[0m\t\t\t\t\t\t\t\t"; 
        
        String result;
        if(marks1 >= 75.0) result = "\033[34;1mDistinguished Pass\033[0m";
        else if(marks1 >= 65.0) result = "\033[32;1mCredit Pass\033[0m";
        else if(marks1 >= 55.0) result = "\033[33;1mPass \033[0m"; 
        else result ="\033[31;1mFail\033[0m"; 

        if(marks2 >= 75.0) result = "\033[34;1mDistinguished Pass\033[0m";
        else if(marks2 >= 65.0) result = "\033[32;1mCredit Pass\033[0m";
        else if(marks2 >= 55.0) result = "\033[33;1mPass \033[0m"; 
        else result ="\033[31;1mFail\033[0m"; 

        if(marks3 >= 75.0) result = "\033[34;1mDistinguished Pass\033[0m";
        else if(marks3 >= 65.0) result = "\033[32;1mCredit Pass\033[0m";
        else if(marks3 >= 55.0) result = "\033[33;1mPass \033[0m"; 
        else result ="\033[31;1mFail\033[0m"; 
        
        String subjectCode1 = sub1.substring(3);

        
        String nameUpperCase = name.toUpperCase();

        System.out.println("+"+"-".repeat(79)+"+");
        System.out.println("|   Name : \033[34;1m" + nameUpperCase + "\033[0m\t\t\t\t\t\t\t\t|");
        System.out.printf("|   Age : %s years old \t\t\t\t\t\t\t\t|\n",age);
        System.out.printf("|   Status : %s|\n" , status);
        System.out.printf("|   Total : %.2f \t\t\t\t\t Avg : %.2f%s\t\t|\n",totalMarks,avgMarks,"%");
        System.out.println("+"+"-".repeat(79)+"+");
        System.out.println("|\tSubject\t\t|\tMarks\t\t|\t\tStatus\t\t|");
        System.out.printf("|\tSE-00%s\t\t|\t%.2f\t\t|\t\t%s\t\t|\n",subjectCode1,marks1,result);


    }
    
}
