package abramyan;

public class CircleRunner {
    public static void main(String[] args) {
        double S = 78.5; // заданная площадь
        double pi = 3.14; // значение п=3.14
        double D = 0.0;

        for (double d = 0.0; d <= 100.0; d += 0.01) { // Формула: D = sqrt(4 * S / pi),
            double s = pi * d * d / 4; // если считать вручную, то для 78.5, это 314
            double diff = s - S;
            if (diff < 0) diff = -diff;
            if (diff < 0.001) {
                D = d;
                break;
            }
        }

        double L = pi * D;

        System.out.println("Диаметр D = " + D);
        System.out.println("Длина окружности L = " + L);
    }
}

// Begin 15.