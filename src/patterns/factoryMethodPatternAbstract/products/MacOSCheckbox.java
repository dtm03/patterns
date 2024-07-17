package patterns.factoryMethodPatternAbstract.products;

import patterns.factoryMethodPatternAbstract.factories.Checkbox;

// Concrete product for MacOS Checkbox
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in MacOS style.");
    }
}
