package patterns.factoryMethodPatternAbstract.concreteFactories;
import patterns.factoryMethodPatternAbstract.GUIFactory;
import patterns.factoryMethodPatternAbstract.concreteProducts.MacOSButton;
import patterns.factoryMethodPatternAbstract.concreteProducts.MacOSCheckbox;
import patterns.factoryMethodPatternAbstract.productInterfaces.Button;
import patterns.factoryMethodPatternAbstract.productInterfaces.Checkbox;

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
