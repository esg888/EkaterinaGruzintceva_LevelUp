package Kitchen;

public class Food {
    String name;
    String color;
    int calories;
    public String getName(){ return name; }
    public String getColor (){ return color; }
    public int getCalories (){ return calories; }

    public Food(String name, String color, int calories){
/*   if (calories < 0) {
        throw new NegativeCaloriesExseption("ТЕСТ СООБЩЕНИЕ");

 }*/
        this.name = name;
            this.color = color;
           this.calories = calories;
    }

    public void fry(){

        System.out.println("Слегка обжариваем  " + name + ", его цвет "+ color);
    }
    public void cut(){

        System.out.println("Режем  " + name + color);
    }

    public void boil(){

        System.out.println("Варим  " + name + color);
    }

}