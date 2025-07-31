package abramyan; // Abramyan joined the game

public class SummerChisler {
    public static void main(String[] args) {
        int number = 25; // задаём двузначное число

        int tens = number / 10;       // первая цифра (10-ки)
        int units = number % 10;      // вторая цифра (1-цы)

        int sum = tens + units;
        int product = tens * units;

        System.out.println("Число: " + number);
        System.out.println("Сумма цифр: " + sum);
        System.out.println("Произведение цифр: " + product);
    }
}

// Integer 7.