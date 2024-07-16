package patterns.factoryMethodPatternAbstract.concreteProducts;

import patterns.factoryMethodPatternAbstract.productInterfaces.Button;

// Concrete product for Windows Button
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }
}

