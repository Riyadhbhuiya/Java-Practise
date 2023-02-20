import java.util.*;

class minmax{
  public static void main(String[] args) {
    
    int array[] = {10,20,16272, 1829,18292};
    Arrays.sort(array);
    
    System.out.print("Minimum: " + array[0]); 
    System.out.println("Maximum: " + array[array.length - 1]);
  }
}
