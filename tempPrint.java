public class tempPrint {
    public static void main(String[] args) {
        String name = "Gayum sasiri";
        int age = 15;
        double sub1 =94.34;
        double sub2 =45.33;
        double sub3 = 99.99;





        double totalMarks = sub1 + sub2 + sub3;
        double avgMarks = totalMarks/3.0;
        String status;
        if(avgMarks >= 75) status = "\033[33mDistinguished Pass\033[0m";
        if(avgMarks < 75) status = "\033[34mCredit Pass\033[0m";
        if(avgMarks <= 55) status = "\033[33mPass \033[0m"; 
        else status ="\033[31Fail\033[0m]";      

        
        String nameUpperCase = name.toUpperCase();

        System.out.println("+"+"-".repeat(79)+"+");
        System.out.println("|   Name : \033[34;1m" + nameUpperCase + "\033[0m\t\t\t\t\t\t\t\t|");
        System.out.printf("|   Age : %s years old \t\t\t\t\t\t\t\t|\n",age);
        System.out.println("|   Status : " + status + "\t\t\t\t\t\t\t\t|");
    }
    
}
