import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Radius of circle (in cm) : ");
		float radius = sc.nextFloat();
		System.out.print("Area of Circle = "+ Math.PI * Math.pow(radius,2)+" cm^2");
    }
}
