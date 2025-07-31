package abramyan; // Abramyan joined the game

public class CircleRunner {
    public static void main(String[] args) {
        double pi = 3.14;
        double L = 6;

        double D = L / pi;
        double S = pi * D * D / 4;

        System.out.println("Площадь круга: " + S);
    }
}