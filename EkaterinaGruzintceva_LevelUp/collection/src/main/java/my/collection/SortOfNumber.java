package my.collection;

import java.util.*;

public class SortOfNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(); // Создание коллекции

        for (int i = 0; i < 100000; i++) { // Заполнение коллекции последовательностью чисел от 0 до 1000000
            list.add(i);
        }

        Collections.shuffle(list); // организация произвольного порядка

        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i) + " "); // Показываем что порядок произвольный, выводя первые 10 чисел к примеру
        }

        final Set<Integer> set = new HashSet<>(list);

        System.out.println(list.size() == set.size()); // Если размеры равны то это значит что в исходной коллекции элементы были уникальны

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        ArrayList<Integer> alist = new ArrayList<>();
        ArrayList<Integer> blist = new ArrayList<>();
        ArrayList<Integer> clist = new ArrayList<>();
        ArrayList<Integer> dlist = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                alist.add(list.get(i));
                // Сохраняем только четные числа
            } else if (list.get(i) % 3 == 0) {
                blist.add(list.get(i));
            } else if (list.get(i) % 5 == 0) {
                clist.add(list.get(i));
            } else if (list.get(i) % 7 == 0) {
                dlist.add(list.get(i));
            }
        }

        for (int i = 0; i < alist.size() / 1000; i++) { // первые 1000 элементов
            System.out.println("четные: " + alist.get(i) + " ");
            // Выводим последовательность четных чисел
        }
        for (int i = 0; i < blist.size() / 1000; i++) { // первые 1000 элементов
            System.out.println(" на 3 : " + blist.get(i) + " ");
        }
        for (int i = 0; i < blist.size() / 1000; i++) { // первые 1000 элементов
            System.out.println(" на 5  : " + clist.get(i) + " ");
        }
        for (int i = 0; i < blist.size() / 1000; i++) { // первые 1000 элементов
            System.out.println(" на 7 : " + dlist.get(i) + " ");
        }
    }
}
