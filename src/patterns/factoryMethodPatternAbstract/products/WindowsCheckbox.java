package patterns.factoryMethodPatternAbstract.products;

import patterns.factoryMethodPatternAbstract.factories.Checkbox;

// Concrete product for Windows Checkbox
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in Windows style.");
    }
}
