package Activity;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Francisco15_5 
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    DecimalFormat twodec= new DecimalFormat("0.00");
    double areaC,areaR,areaT, radius, length, width, base, height; 
    int choice; 
       
       System.out.println("AREA COMPUTATION : ");
       System.out.println("(Choose the shape you want to compute the area of)\n");
       System.out.println("[1] Circle");
       System.out.println("[2] Rectangle");
       System.out.println("[3] Triangle");
       System.out.println("------------------------------------------------");
       System.out.print("Enter Your Choice    : ");
       choice= input.nextInt();
       System.out.println("------------------------------------------------");
      
       if (choice==1)
       {
       System.out.println("Area of a Circle\n");
       System.out.print("Radius               : ");
       radius = input.nextDouble();
       areaC=3.14*radius*radius; 
       System.out.println("Area of a Circle     : " + twodec.format(areaC));
       }
       else if (choice==2)
       {
       System.out.println("Area of a Rectangle\n");
       System.out.print("Length               : ");
       length = input.nextDouble();
       System.out.print("Width                : ");
       width = input.nextDouble();
       areaR= length*width;
       System.out.println("Area of a Rectangle  : " + twodec.format(areaR));
       }
        else if (choice==3)
       {
       System.out.println("Area of a Triangle\n");
       System.out.print("Base                 : ");
       base = input.nextDouble();
       System.out.print("Height               : ");
       height = input.nextDouble();
       areaT= 0.5*base*height;
       System.out.println("Area of a Triangle   : " + twodec.format(areaT));
       }
       else
       {
       System.out.println("You have entered an invalid choice");
       }
       System.out.println("------------------------------------------------");
    }
}