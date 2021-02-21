package Kitchen;

public class Seasoning  {

    public static void main(String[] args) {

        Spices salt = new Spices("Соль ", "Вкус соленый");
        salt.addSpice();
    }
}
interface SeasonAdd{

    void addSpice();
}
class Spices implements SeasonAdd{

    String spicesname;
    String taste;

    Spices(String spicesname, String taste){

        this.spicesname = spicesname;
        this.taste = taste;
    }

    public void addSpice() {
        System.out.println("Сыпем ");

        System.out.printf("%s (%s) \n", spicesname, taste);
    }

}
