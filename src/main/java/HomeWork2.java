import java.util.Scanner;


class homework2 {
    public static void main(String[] args) {
        checkNumbers(2, 8);
        parameter();
        printWord("Hello", 3);
        checkYear();

    }

    public static boolean checkNumbers(int a, int b) {
        int s = a + b;
        if (s >= 10 && s <= 20) {
            return (true);
        } else {
            return (false);
        }

    }

    public static void parameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки:");
        int a = scanner.nextInt();
//        scanner.close();
        if (a < 0) {
            System.out.println("Число отрицетельное");
        } else {
            System.out.println("Число положительное");
        }

    }

    public static void printWord(String word, int interations) {
        for (int j = 0; j <= interations; j++) {
            System.out.println(word);
        }
    }

    public static void checkYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год для проверки:");
        int year = scanner.nextInt();
        if(((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))))
        {
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год не високосный");
        }
        scanner.close();

    }
}
