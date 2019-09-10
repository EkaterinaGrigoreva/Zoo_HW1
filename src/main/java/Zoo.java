public class Zoo {



    public static void feedAnimal(Herbivores animalH) {


        Vegetables[] bananas = new Vegetables[20];
        for (int i = 0; i < bananas.length; i++) {
            bananas[i] = new Vegetables() {
            };

            animalH.areYouHungry();
            animalH.eat(bananas[i]);
        }



        for(Vegetables banana : bananas){
            if(banana.value == 0){
                System.out.println("Тут только кожура!");
            } else {
                System.out.println("Питательный банан!");
            }
        }

        Meat[] meat = new Meat[20];
        for (int i = 0; i < meat.length; i++) {
            meat[i] = new Meat() {
            };

            animalH.areYouHungry();
            animalH.eat(meat[i]);


        }
        for(Meat m : meat){
            if(m.value == 0){
                System.out.println("Тут только кости!");
            } else {
                System.out.println("Свежая кровь!");
            }
        }
    }

    public static void feedAnimal(Predators animalP) {


        Vegetables[] bananas = new Vegetables[20];
        for (int i = 0; i < bananas.length; i++) {
            bananas[i] = new Vegetables() {
            };

            animalP.areYouHungry();
            animalP.eat(bananas[i]);
        }



        for(Vegetables banana : bananas){
            if(banana.value == 0){
                System.out.println("Тут только кожура!");
            } else {
                System.out.println("Питательный банан!");
            }
        }

        Meat[] meat = new Meat[20];
        for (int i = 0; i < meat.length; i++) {
            meat[i] = new Meat() {
            };

            animalP.areYouHungry();
            animalP.eat(meat[i]);


        }
        for(Meat m : meat){
            if(m.value == 0){
                System.out.println("Тут только кости!");
            } else {
                System.out.println("Свежая кровь!");
            }
        }
    }






    public static void main(String[] args) {


        Monkey bob = new Monkey("Bob", -100);


        Lion king = new Lion("King", -100);
        Lion simba = new Lion("Simba", -100);
        Tiger timon = new Tiger("Timon", -100);
        Tiger molly = new Tiger("Molly", -100);

        feedAnimal(bob);
        feedAnimal(king);




        addAnimal(simba);
        addAnimal(timon);
        addAnimal(king);
        addAnimal(molly);


    }
}
