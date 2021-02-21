package Kitchen;

import java.util.ArrayList;

public class Borscht {

    ArrayList<Vegatables> vegList = new ArrayList<>(11);

    Vegatables onion;
    {
        onion = new Vegatables("Лук", "Белый", 43);
    }

    vegList.add(onion)
            System.out.println(Arrays.toString(vegList));;
}

