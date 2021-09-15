public class Dog extends Animals {
    public static final int MAX_SWIM = 500;
    protected String name;

    @Override
    void swim(int param) {
        System.out.println(param < MAX_SWIM ? "Dog swim "+param+" m" : "Dog swim only "+MAX_SWIM+" m");
    }

    @Override
    void run(int param) {
        System.out.println("Dog run "+param+" m");
    }

    @Override
    public void voice() {
        System.out.println("Dog voice gav");
    }
}
