public class Tiger extends Predators {
    public Tiger(String name, int hungry) {
        super(name, hungry);
    }

    public boolean eat(Meat meat) {
        return false;
    }

    public void dontEat(Vegetables  bananas){
        System.out.println("Я такое не ем");
    }

    @Override
    public void areYouHungry() {
        super.areYouHungry();
    }
}
