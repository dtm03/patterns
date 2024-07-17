package factoryMethodPatternAbstract;

import factoryMethodPatternAbstract.factories.GUIFactory;
import factoryMethodPatternAbstract.factories.WindowsFactory;

public class FactoryMethodAbstractDemo {
    public static void main(String[] args) {
       GUIFactory factory = new WindowsFactory();
         factory.createButton().paint();
    }
}
