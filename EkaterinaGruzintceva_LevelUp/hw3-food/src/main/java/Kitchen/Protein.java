package Kitchen;

public class Protein extends Food {
    @Override
    public void cut() {
        System.out.println("Режем небольшими кусочками");
    }

    @Override
    public void boil() {
        System.out.println("Кладем в большую кастрюлю ");
    }
}
