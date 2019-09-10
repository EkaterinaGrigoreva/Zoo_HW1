public class AviaryPredators {



    public static int addAnimal(Predators animalP) {


        Predators[] predator = new Predators[1];
        for (int i = 0; i < predator.length; i++) {
            predator[i] = new Predators("", 100){};
            AviaryPredators.add(animalP);

        }

        int pCount = 0;
        for(Predators p : predator){
            pCount = predator.length;
        }

        return pCount;

    }

static int cage = 2;

    public static void add(Predators animalP) {
        for (int i = 0; i < cage; i++) {
        }
        if (this.pCount > cage) {
            System.out.println("мест нет");
        } else {
            System.out.println("добро пожаловать домой");
        }

    }


}
