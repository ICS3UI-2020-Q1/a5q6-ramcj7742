import java.util.Scanner;
/**
 * Creates box based on user input
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //Gets number from user
    System.out.println("Please enter a number between 1 and 10");
    int userNum = input.nextInt();


    //loop for horizontal astericks
    for(int i = 0; i < userNum; i++){
      for(int j = 0; j < userNum; j++){
        System.out.print(" * ");
      }
      System.out.println("");
    }
    
  }
}
