import java.util.Scanner;

public class PenDistributor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPens = 14;
        int students = 3;
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
