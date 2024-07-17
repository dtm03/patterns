package patterns.factoryMethodPatternAbstract.factories;
import patterns.factoryMethodPatternAbstract.products.MacOSButton;
import patterns.factoryMethodPatternAbstract.products.MacOSCheckbox;

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
