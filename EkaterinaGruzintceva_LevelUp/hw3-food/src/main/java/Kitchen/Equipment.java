package Kitchen;

public class Equipment implements Cook {String appellative;
    public String getName(){ return appellative; }
        public Equipment (String appellative){

        this.appellative= appellative;

    }

    @Override
    public void cooking() {System.out.println("Вари," + appellative + "!");

    }
}
