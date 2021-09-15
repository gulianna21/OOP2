public class Cat extends Animals {
    public static int countCats;
    public static final int MAX_RUN = 200;
    protected String name;
    protected int appetite;
    protected boolean fullness;

    public Cat(){
        ++countCats;
    }

    public Cat(String name,int appetite){
        ++countCats;
        this.name=name;
        this.appetite=appetite;
        this.fullness=false;
    }

    public String getName(){
        return name;
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

    public int getAppetite() {
        return appetite;
    }

    public int getCountCats() {
        return countCats;
    }

    public boolean getFullness() {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        boolean check = p.decreaseFood(appetite);
        if(check){
            this.fullness=true;
        } else {
            System.out.println("Котик не покушал, ему не хватило :(");
        }
    }
}
