package Kitchen;

import java.util.ArrayList;
import java.util.List;

public class Borscht {
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

        ArrayList<Protein> Proteins = new ArrayList<>();
        Protein meat = new Protein("Мясо", "Красный", 203);
        Protein fat = new Protein("Сало", "Белый", 797);
        Food garlic = new Vegetable("Чеснок", "Белый", 149);//полиморфизм
        garlic.fry();
        meat.cut();
        fat.cut();
        meat.fry();
        fat.fry();

        onion.cut();
carrot.cut();
beet.cut();
cabbage.cut();
        meat.boil();
        fat.boil();
      onion.boil();
        carrot.boil();
        beet.boil();
        cabbage.boil();
        Equipment pot = new Equipment ("Кастрюля");
        Seasoning salt = new Seasoning("Соль", "Соленый");
        Seasoning papper = new Seasoning("Перец", "Острый");
        salt.pour();
        papper.pour();
        pot.cooking();

        int Index = Vegetables.indexOf(onion);
       // System.out.println(Index);
        Vegetable newVegetable = Vegetables.get(Index);
        System.out.println("У нас есть "+ newVegetable.name + ", его цвет " + newVegetable.color + ", а калорийность " + newVegetable.calories);
    }

    }






