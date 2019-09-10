public class AviaryPredators {

static int cage = 2;

    public static void add(Predators animalP) {
        for (int i = 0; i < cage; i++) {
        }
        if (Zoo.addAnimal(animalP).pCount > cage) {
            System.out.println("мест нет");
        } else {
            System.out.println("добро пожаловать домой");
        }

    }


}
