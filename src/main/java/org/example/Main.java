package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер списка: ");
        int n = scanner.nextInt();
        System.out.println("Введите верхнюю границу значений элементов в списке");
        int m =  scanner.nextInt();
        logger.log("Создаем и наполняем список");
        List<Integer> randomList = generateRandom(n,m);
        System.out.println("Вот случайный список: " + randomList);

        logger.log(" Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int f =  scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> listFilter = filter.filterout(randomList);
        logger.log("Выводим результат на экран ");

        System.out.println("Отфильтрованный список " + listFilter);

        logger.log("Завершаем программу.");
    }
    private static List <Integer> generateRandom(int n , int m){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           list.add( random.nextInt(m));
        } return list;
    }
}