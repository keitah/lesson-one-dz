package abramyan; // Abramyan joined the game

public class ThreeCounters { // no trees!
    public static void main(String[] args) {
        double A = 2;
        double B = 5;
        double C = 9;

        double AC = -(A - C); // Вычисляем длину отрезка AC, "pov" AC = -(2 - 9) = 7
        System.out.println("Длина отрезка AC = " + AC);

        double BC = -(B - C); // Вычисляем длину отрезка AC, "pov" BC = -(5 - 9) = 4
        System.out.println("Длина отрезка BC = " + BC);

        double sum = AC + BC; // Вычисляем сумму длин AC и BC и выводим "pov" sum(AC+BC) = 7+4 = 11
        System.out.println("Сумма длин отрезков AC и BC = " + sum);
    }
}


