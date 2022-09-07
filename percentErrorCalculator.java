import java.util.Scanner;
public class percentErrorCalculator {
    public static void main(String[] args){
        
        // vA = Actual value
        try (Scanner vA = new Scanner(System.in)) {
            System.out.println("Enter actual value: ");
            float vAV = vA.nextFloat();	//i honestly do not know the difference between float and double

            // vE = Estimated value
            try (Scanner vE = new Scanner(System.in)) {
                System.out.println("Enter estimated value: ");
                float vEV = vE.nextFloat();

                float x = vAV - vEV;
                float y = x / vEV;
                float z = y * 100;

                float answer = Math.abs(z); //Absolute value thingy

                System.out.println("Here is your value: " + answer);
                /* btw the percent error equation is 
                 Actual value - Estimated Value 
                 divided by Estimated value multiplied by 100 */
            }
        }
    }
}
