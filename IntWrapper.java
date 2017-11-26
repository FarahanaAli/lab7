import java.util.Scanner;

public class IntWrapper{

public static void main(String[] args) {
	System.out.println("Integer Max Value: "+Integer.MAX_VALUE);
    System.out.println("Integer Min Value: "+Integer.MIN_VALUE);
 Scanner scan= new Scanner(System.in);
 System.out.println("Enter the first integer");
  String firstInt= scan.next();
 System.out.println("Enter the second integer");
  String secondInt=scan.next();
 int sum= (Integer.parseInt(firstInt)+Integer.parseInt(secondInt));
 System.out.println("Sum: " + sum);
    
    
}
}