package factoryMethodPatternAbstract.factories;
import factoryMethodPatternAbstract.products.MacOSButton;
import factoryMethodPatternAbstract.products.MacOSCheckbox;

// Concrete factory for MacOS
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
