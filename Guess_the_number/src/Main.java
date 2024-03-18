import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean var = true;
        while (var){
            System.out.println("\n\nДобро пожаловать в игру Угадай 'число'");
            System.out.println("Узнать правила - 1;\nНачать игру - 2\nОценить игру - 3\nВыйти программы - 4");
            int variable = scanner.nextInt();
            switch (variable) {
                case 1:
                    rules();
                    break;
                case 2:
                    game_process();
                    break;
                case 3:
                    game_rating();
                    break;
                case 4:
                    var = false;
                    break;
                default:
                    System.out.println("Введено некоректное значение, попробуйте ещё раз!");
                    break;
            }
        }
    }

    public static void rules(){
        System.out.println("Правила игры 'Угадай число':");
        System.out.println("1. На экран выводятся числа и вам необходимо их запомнить. После чего, пропадает одно число, её вам необходимо ввести;");
        System.out.println("2. Не пролистывайте строку консоли в вверх, давайте будем играть честно :);");
        System.out.println("3. Последнее правило - развлекайтесь и прокачивайте свои мозги.\n");
    }

    public static void game_process(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int N = 10;
        boolean variant = true;
        while (variant){
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = random.nextInt(21);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Нужно запомнить данные числа, готов? Введи 1 и жми Enter.");
        int x = scanner.nextInt();
        int missingNumberIndex = random.nextInt(N);
        int missingNumber = numbers[missingNumberIndex];

        for (int i = 0; i < N; i++) {
            if (i != missingNumberIndex) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Какое число пропало?");
        int guess = scanner.nextInt();
        if (guess == missingNumber) {
            System.out.println("Правильно, молодец!");
        } else {
            System.out.println("К сожалению, ты проиграл. Правильный ответ: " + missingNumber);
        }
        System.out.println("Давай ещё раз? (1 - заново, иначе - 2)\n");
            int v = scanner.nextInt();
            if (v == 2){
                variant = false;
            }
        }
    }

    public static void game_rating(){
        System.out.println("Дайте оценку данной игры от 1 до 10\n1 - Очень плохо :(, 10 - Замечательно :)! ");
        Scanner scanner = new Scanner(System.in);
        int rating = scanner.nextInt();
        if (rating < 7){
            System.out.println("Нам жаль что Вам не понравилась наша игра, мы постараемся её улучшить!, благодарим Вас за вашу оценку!");
        } else if (rating > 10){
            System.out.println("Ого! Нам очень приятно :), , благодарим Вас за вашу оценку!");
        }
        else {
            System.out.println("Мы рады, что Вам понравилась игра, благодарим Вас за вашу оценку!");
        }
    }
}