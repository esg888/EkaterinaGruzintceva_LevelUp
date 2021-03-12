package Kitchen;

public class Seasoning  {String name;
    String taste;

    protected String getName(){ return name; }
    protected String getColor (){ return taste; }

    protected Seasoning(String name, String taste){

        this.name= name;
        this.taste = taste;
           }

    public void pour(){

        System.out.println("Добавляем  " + name + ", чтобы добавить "+ taste + " вкус");
    }
}
