public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Dog dog1 = new Dog();
        dog1.run(200);
        dog1.swim(300);
        cat1.swim(150);
        cat1.run(600);
        cat2.swim(300);
        cat2.run(190);
        System.out.println("All animals created: " + cat1.getCount() +
                " count, " + cat1.getCountCats() + " cats and " + dog1.getCountDogs() + " dogs");
    }
}
