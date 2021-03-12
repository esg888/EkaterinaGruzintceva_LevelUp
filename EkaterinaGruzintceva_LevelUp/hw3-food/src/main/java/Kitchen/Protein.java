package Kitchen;
//наследование
public class Protein extends Food  {


    Protein (String name,
             String color,
             int calories)
    {
        super(name, color, calories);    }


    @Override
    public void cut (){

        System.out.println("Режем небольшими кусочками  "  + name + ", его цвет "+ color);
    }
    @Override
    public void boil(){

        System.out.println("Варим "  + name + ", его цвет "+ color);
    }
}

