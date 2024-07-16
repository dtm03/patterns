package patterns.factoryMethodPatternAbstract.concreteFactories;

import patterns.factoryMethodPatternAbstract.GUIFactory;
import patterns.factoryMethodPatternAbstract.concreteProducts.WindowsButton;
import patterns.factoryMethodPatternAbstract.concreteProducts.WindowsCheckbox;
import patterns.factoryMethodPatternAbstract.productInterfaces.Button;
import patterns.factoryMethodPatternAbstract.productInterfaces.Checkbox;

// Concrete factory for Windows
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}