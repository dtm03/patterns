package patterns.nullObjectPattern;

public class NullObjectPatternDemo {
    public static void main(String[] args) {
        Worker worker1 = new Engineer();
        worker1.work();
        Worker nullWorker = new NullWorker();
        nullWorker.work();
    }
}
