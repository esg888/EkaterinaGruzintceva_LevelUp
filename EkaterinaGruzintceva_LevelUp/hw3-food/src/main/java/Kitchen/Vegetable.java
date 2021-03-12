package Kitchen;
//наследование
public class Vegetable extends Food {
    Vegetable (String name,
             String color,
             int calories)
    {
        super(name, color, calories);    }

    @Override
    public void fry(){

        System.out.println("Пассируем " + name +" его цвет "+ color);
    }
    @Override
    public void cut (){

        System.out.println("Шинкуем  " + name +", цвет "+ color);
    }
    @Override
    public void boil(){

        System.out.println("Варим наш овощ " + name +" его цвет "+ color);
    }
}
