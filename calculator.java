import java.util.Scanner;

public class calculator {
    public static void main(String[] args) throws Exception {
        double no1;
        double no2;
        double answer;
        char opr;
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Enter 2 numbers!!!!!!!!!!!!!!");
            no1 = reader.nextDouble();
            no2 = reader.nextDouble();
            System.out.println("Pick a variable: +, -, *, /");
            opr = reader.next().charAt(0);
        }
        switch(opr){
                case '+': answer = no1 + no2; 
                    break;
                case '-': answer = no1 - no2;
                    break;
                case '*': answer = no1 * no2;
                    break;
                case '/': answer = no1 / no2;
                    break;
            default: System.out.println("enter a correct operator!!!!!!!!!!!");
            return;
                     } 
                     System.out.println("Answer:");
                     System.out.println(no1 + " " + opr + " " + no2 + " " + "=" + " " + answer);
             }
     }