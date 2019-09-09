public abstract class Animals {
    protected int hungry;
    public final String name;

    public Animals( String name, int hungry) {
        this.hungry = hungry;
        this.name = name;
    }

    public boolean eat(Meat  meat){
        hungry += meat.value;
        meat.value = 0;
        return hungry >= 0;
    }


    public boolean eat(Vegetables  bananas){
        hungry += bananas.value;
        bananas.value = 0;
        return hungry >= 0;
    }

    public void dontEat(Vegetables vegetables){};

    public void dontEat(Meat meat){};

    public void areYouHungry() {
        if (hungry >= 0) {
            System.out.println( name + " сытый! " + hungry);
        } else {
            System.out.println(name + " ЖРАААААТЬ! " + hungry);
        }

    }



}
