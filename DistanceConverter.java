import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kilometers = 10.8;
        double miles = kilometers * 1.6;
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
