package Порождающие_шаблоны_2_Singleton;

import java.util.*;

public class Main {
    private static int size, maxValue, treshold;

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");

        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else {
            System.out.println("Введено не число!");
        }
        System.out.println("Введите верхнюю границу для значений:");

        if (scanner.hasNextInt()) {
            maxValue = scanner.nextInt();
        } else {
            System.out.println("Введено не число!");
        }
        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue));
        }
        System.out.println("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");

        if (scanner.hasNextInt()) {
            treshold = scanner.nextInt();
        } else {
            System.out.println("Введено не число!");
        }
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(treshold);
        List<Integer> result = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }
}
