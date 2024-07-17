package patterns.factoryMethodPatternAbstract;

import patterns.factoryMethodPatternAbstract.factories.GUIFactory;
import patterns.factoryMethodPatternAbstract.factories.WindowsFactory;

public class FactoryMethodAbstractDemo {
    public static void main(String[] args) {
       GUIFactory factory = new WindowsFactory();
         factory.createButton().paint();
    }
}
