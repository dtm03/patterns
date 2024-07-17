package patterns.factoryMethodPatternAbstract.products;

import patterns.factoryMethodPatternAbstract.factories.Button;

// Concrete product for MacOS Button
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in MacOS style.");
    }
}
