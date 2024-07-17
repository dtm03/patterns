package patterns.observerPattern;

public class BinaryObserver extends Subject implements Observer {
    private final Subject subject;

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
