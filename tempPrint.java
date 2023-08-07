public class tempPrint {
    public static void main(String[] args) {
        String name = "Gayum sasiri";
        int age = 15;
        double sub1 =10.34343;
        double sub2 =45.33343;
        double sub3 = 34.99434;





        double totalMarks = sub1 + sub2 + sub3;
        double avgMarks = totalMarks/3.0;
        String status;
        if(avgMarks >= 75.0) status = "\033[34;1mDistinguished Pass\033[0m\t\t\t\t\t\t\t";
        else if(avgMarks >= 65.0) status = "\033[32;1mCredit Pass\033[0m\t\t\t\t\t\t\t";
        else if(avgMarks >= 55.0) status = "\033[33;1mPass \033[0m\t\t\t\t\t\t\t\t"; 
        else status ="\033[31;1mFail\033[0m\t\t\t\t\t\t\t\t";      

        
        String nameUpperCase = name.toUpperCase();

        System.out.println("+"+"-".repeat(79)+"+");
        System.out.println("|   Name : \033[34;1m" + nameUpperCase + "\033[0m\t\t\t\t\t\t\t\t|");
        System.out.printf("|   Age : %s years old \t\t\t\t\t\t\t\t|\n",age);
        System.out.printf("|   Status : %s|\n" , status);
        System.out.printf("|   Total : %.2f \t\t\t\t\t Avg : %.2f%s\t\t|\n",totalMarks,avgMarks,"%");
        System.out.println("+"+"-".repeat(79)+"+");

    }
    
}
