//Задание 1
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    //Задание 2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Задание 3
    public static void checkSumSign() {
        int a = 4;
        int b = -7;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else if (a + b <= 0) {
            System.out.println("Отрицательное значение");
        }
    }

    //Задание 4
    public static void printColor() {
        int value = 109;
        ;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value >= 100) {
            System.out.println("Зеленый");
        }
    }

    //Задание 5
    public static void compareNumbers() {
        int a = 242;
        int b = 31;
        if (a >= b) {
            System.out.println("a >= b");
        } else if (a < b) {
            System.out.println("a < b");
        }
    }
}