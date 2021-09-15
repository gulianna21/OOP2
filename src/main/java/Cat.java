public class Cat extends Animals {
    public static int countCats;
    public static final int MAX_RUN = 200;
    protected String name;

    public Cat(){
        ++countCats;
    }

    @Override
    void swim(int param) {
        System.out.println("Cat can't swim!");
    }

    @Override
    void run(int param) {
        System.out.println(param < MAX_RUN ? "Cat run " + param + " m" : "Cat run only "+MAX_RUN+" m");
    }

    @Override
    public void voice() {
        System.out.println("Cat voice miy");
    }

    public int getCountCats() {
        return countCats;
    }
}
