package Kitchen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
class  Salad {
    public static void main(String[] args) {
        ArrayList<Vegetable> Vegetables = new ArrayList<>();
        Vegetable onion = new Vegetable("Лук", "Белый", 43);
        Vegetable carrot = new Vegetable("Морковь", "Оранжевый", 41);
        Vegetable beet = new Vegetable("Свекла", "Фиолетовый", 43);
        Vegetable cabbage = new Vegetable("Капуста", "Зеленый", 27);
        Vegetables.add(onion);
        Vegetables.add(carrot);
        Vegetables.add(beet);
        Vegetables.add(cabbage);

        Collections.sort(Vegetables, new Comparator<Vegetable>() {
            @Override
            public int compare(Vegetable o1, Vegetable o2) {
                return o1.calories - o2.calories;
            }
        });
    }
    for (Vegetable veg: Vegetables) {System.out.println(veg);}
        }
