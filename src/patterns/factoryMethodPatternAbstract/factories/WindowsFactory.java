package patterns.factoryMethodPatternAbstract.factories;

import patterns.factoryMethodPatternAbstract.products.WindowsButton;
import patterns.factoryMethodPatternAbstract.products.WindowsCheckbox;

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