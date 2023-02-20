import java.util.Scanner;

class leapyear {
  public static void main(String[] args) {
    
    Scanner year = new Scanner(System.in);
    System.out.println("Enter the year: ");
    int leapData = year.nextInt();
    
    if((leapData % 400 == 0) || ((leapData % 4 == 0) && (leapData % 100 == 0))) {
      System.out.println(leapData + " is a leap year!");
    } else {
      System.out.println(leapData + "is not a leap year!");
    }
    
  }
}