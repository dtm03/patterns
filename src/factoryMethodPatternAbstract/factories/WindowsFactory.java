package factoryMethodPatternAbstract.factories;

import factoryMethodPatternAbstract.products.WindowsButton;
import factoryMethodPatternAbstract.products.WindowsCheckbox;

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