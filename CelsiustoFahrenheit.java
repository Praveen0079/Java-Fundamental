import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperature in Celsius : ");
        float Celsius = sc.nextFloat();
        float Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println(Celsius+"degree Celsius = "+Fahrenheit);
    }
}
