package patterns.factoryMethodPatternAbstract;
import patterns.factoryMethodPatternAbstract.productInterfaces.Button;
import patterns.factoryMethodPatternAbstract.productInterfaces.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
