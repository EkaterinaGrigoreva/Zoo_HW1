public class Giraffe extends Herbivores {
    public Giraffe(String name, int hungry) {
        super(name, hungry);
    }

    public boolean eat(Vegetables bananas) {
        return false;
    }


    public void dontEat(Meat meat){
        System.out.println("Я такое не ем");
    }

    @Override
    public void areYouHungry() {
        super.areYouHungry();
    }
}
