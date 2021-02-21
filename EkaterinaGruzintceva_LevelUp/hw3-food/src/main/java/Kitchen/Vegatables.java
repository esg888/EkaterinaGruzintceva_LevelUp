package Kitchen;

public class Vegatables extends Food  {
    @Override
public void cut() {
    System.out.println("Шинкуем наш овощ ");
}

    @Override
    public void boil() {
        System.out.println("Кидаем в большую кастрюлю ");
    }

}
