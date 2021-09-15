public class Main {
    public static void main(String[] args) {
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Аська", 50);
        allCats[1] = new Cat("Куркума", 30);
        allCats[2] = new Cat("Авокадушко", 20);
        allCats[3] = new Cat("Мася", 80);

        Plate newPlate = new Plate(100);
        newPlate.info();

        for (Cat allCat : allCats) {
            if (!allCat.getFullness() && allCat.getAppetite() <= newPlate.getFood()) {
                allCat.eat(newPlate);
                System.out.println("Котэ " + allCat.getName() + " покушал!");
            } else {
                System.out.println("Котэ " + allCat.getName() + " не поел!");
            }
        }
        newPlate.info();

        newPlate.increaseFood(500);
    }
}
