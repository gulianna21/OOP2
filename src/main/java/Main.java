public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        dog1.run(200);
        dog1.swim(300);
        cat1.swim(150);
        cat1.run(600);
        cat2.swim(300);
        cat2.run(190);
        System.out.println("Animals: " +cat1.getCount()+" count");
    }
}
