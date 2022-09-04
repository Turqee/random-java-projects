import java.util.Scanner;  // Import the Scanner class

class numguessing {
    
  public static void main(String[] args) {

    try (Scanner myObj = new Scanner(System.in)) {
        int min = 0;  //defining mins and maxs
        int max = 100;
        int number = (int)Math.floor(Math.random()*(max-min+1)+min); //random ahh number
        int guess = 0;
        String wrong = "Your guess is wron!!!!"; //store the string value so i can be lazy and not have to write more 
    while (guess != number){   
        System.out.println("Enter Number:");

        guess = myObj.nextInt();  // Read user input
        if (guess < number){
                System.out.println(wrong + " It is too low!!! ");
               
        } else if (guess > number){
                System.out.println(wrong + " It is too high!!! ");
                
               
        } else if (guess == number){
            System.out.println("good game!!!!!!");
                break;
            }

        }
    }
  }
}