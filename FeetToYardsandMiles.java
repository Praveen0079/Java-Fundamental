import java.util.Scanner;

public class FeetToYardsandMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance is " + distanceInYards + " yards and " + distanceInMiles + " miles.");
    }
}
