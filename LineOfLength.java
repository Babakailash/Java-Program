import java.util.Scanner;
import java.lang.*;
public class LineOfLength
{
public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
System.out.println("Enter The value of X1 and X2");
      int x1=sc.nextInt();
      int x2=sc.nextInt();
System.out.println("Enter The value of y1 and y2");
      int y1=sc.nextInt();
      int y2=sc.nextInt();

      double a=Math.pow((x2-x1), 2);
      double b=Math.pow((y2-y1), 2);
      double length_of_line=Math.sqrt(a+b);
     System.out.println("Length Of a line: "+length_of_line);
}
}
