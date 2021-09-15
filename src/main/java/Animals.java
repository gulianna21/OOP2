public abstract class Animals {
    public static int count;
    protected String type;
    protected String name;
    protected String color;

    public Animals() {
        ++count;
    }

    abstract void swim(int param);

    abstract void run(int param);

    abstract void voice();

    public int getCount() {
        return count;
    }

    public void walk() {
        System.out.printf("%s %s %s walk on paws\n", color, type, name);
    }
}
