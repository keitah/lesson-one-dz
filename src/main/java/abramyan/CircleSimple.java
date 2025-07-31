package abramyan; // Abramyan joined the game

public class CircleSimple { // объявляем публичный класс
    public static void main(String[] args) {
        double pi = 3.14; // значение числа pi (( p 3.14 zdec)
        double L = 5; // заданная длина окружности

        double R = L / (2 * pi); // вычисляем радиус по формуле
        double S = pi * R * R; // вычисляем площадь круга по формуле

        System.out.println("Радиус: " + R); // вывод радиуса
        System.out.println("Площадь: " + S); // вывод площади круга
    }
}