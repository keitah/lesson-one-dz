package abramyan; // Abramyan joined the game

public class CircleRunner {
    public static void main(String[] args) {
        double pi = 3.14; // п = 3.14
        double L = 6; // длина окружности

        double D = L / pi; // ищем диаметр, который равен длине окружности, делённой на п=3.14
        double S = pi * D * D / 4; // ищем площадь круга, который равен п*D^2/4

        System.out.println("Площадь круга: " + S); // выводим площадь круга
    }
}