import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int sizeList = 0;
        int maxValue = 0;
        int threshold = 0;

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка : ");
        sizeList = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите верхнюю границу для значений:");
        maxValue = Integer.parseInt(scanner.nextLine());
        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) {
            list.add(random.nextInt(maxValue));
        }
        System.out.print("Вот случайный список:");
        list.forEach(integer -> System.out.print(integer + " "));
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        threshold = Integer.parseInt(scanner.nextLine());
        List<Integer> result = new Filter(threshold).filterOut(list);

        logger.log("Прошло фильтр " + result.size() + " элемента из " + list.size());
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        result.forEach(integer -> System.out.print(integer + " "));
        System.out.println();
        logger.log("Завершаем программу");
    }
}
