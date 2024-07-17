package nullObjectPattern;

public class Manager implements Worker {
    @Override
    public void work() {
        System.out.println("Manager is working");
    }
}
