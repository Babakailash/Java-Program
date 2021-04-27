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
      Double length_of_line1=Math.sqrt(a+b);
     //System.out.println("Length Of a line: "+length_of_line1);

System.out.println("Enter The value of X3 and X4");
      int x3=sc.nextInt();
      int x4=sc.nextInt();
System.out.println("Enter The value of y3 and y4");
      int y3=sc.nextInt();
      int y4=sc.nextInt();

      double c=Math.pow((x4-x3), 2);
      double d=Math.pow((y4-y3), 2);
      Double length_of_line2=Math.sqrt(c+d);
     //System.out.println("Length Of a line: "+length_of_line2);

   if (length_of_line1.equals(length_of_line2)){
       System.out.println("Lines are Equal");
}
       else {
             System.out.println("Lines are not Equal");
}

}
}
