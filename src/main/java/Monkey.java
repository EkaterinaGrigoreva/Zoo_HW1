public class Monkey extends Herbivores {
    public Monkey(String name, int hungry) {
        super(name, hungry);
    }

    public boolean eat(Vegetables bananas) {
        return false;
    }



    @Override
    public void areYouHungry() {
        super.areYouHungry();
    }
}
