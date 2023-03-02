import java.util.*;

class odd-even {
  public static void main(String[] args) {
    
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter desired number: ");
    int inputNumber = userInput.nextInt();
    
    if(inputNumber % 2 == 0) {
      System.out.println("The number is even.");
    } else {
      System.out.println("The number is odd.");
    }
    
  }
}
