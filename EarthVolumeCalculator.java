import java.util.Scanner;

public class EarthVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radiusKm = 6378;
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = volumeKm3 / Math.pow(1.6, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + 
                           " and in cubic miles is " + volumeMiles3);
    }
}
