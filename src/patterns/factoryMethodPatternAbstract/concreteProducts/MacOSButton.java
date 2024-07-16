package patterns.factoryMethodPatternAbstract.concreteProducts;

import patterns.factoryMethodPatternAbstract.productInterfaces.Button;

// Concrete product for MacOS Button
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in MacOS style.");
    }
}
