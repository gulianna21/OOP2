public class Plate {
    private int food;

    public Plate() {
        this.food = 0;
    }

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int oldFood) {
        if (oldFood <= food) {
            food -= oldFood;
            return true;
        } else {
            return false;
        }
    }

    public void increaseFood(int newFood) {
        if (newFood >= 0) {
            food += newFood;
            System.out.println("Добавили в миску "+newFood);
        } else {
            System.out.println("Не отбирайте еду у животных");
        }
    }

    public void info() {
        System.out.println("Всего еды: " + food);
    }

    public int getFood(){
        return food;
    }
}
