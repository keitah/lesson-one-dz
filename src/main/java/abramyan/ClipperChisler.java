package abramyan; // Abramyan joined the game

public class ClipperChisler {
    public static void main(String[] args) {
        int number = 321; // почему бы и нет? :D

        // получаем первую цифру из сотни
        int firstDigit = number / 100;

        // получаем последние две цифры (десяток, единица)
        int lastTwoDigits = number % 100;

        // формируем новое число - приписываем первую цифру к концу
        int result = lastTwoDigits * 10 + firstDigit;

        // выводим результат
        System.out.println("Результат: " + result);
    }
}

// Integer 13.
