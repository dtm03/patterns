package patterns.observerPattern;

public class HexaObserver extends Subject implements Observer {
    private final Subject subject;

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
