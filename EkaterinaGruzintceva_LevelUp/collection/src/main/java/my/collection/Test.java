package my.collection;
import java.util.*;
public class Test {public static void main(String[] args) {
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

    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) % 2 == 0) {
            alist.add(list.get(i)); // Сохраняем только четные числа
        }
    }

    list = null;

    for (int i = 0; i < alist.size() / 1000; i++) { // первые 1000 элементов
        System.out.println("четные: " + alist.get(i) + " "); // Выводим последовательность четных чисел
    };
    ArrayList<Integer> blist = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) % 3 == 0) {
            blist.add(list.get(i)); // проверка деления на 3
        }
    }

    list = null;

    for (int i = 0; i < blist.size() / 1000; i++) { // первые элементы, пример
        System.out.println(alist.get(i) + " "); // Выводим последовательность чисел крат.3
    }
}
}
