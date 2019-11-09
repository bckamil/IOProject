package pl.put.poznan.transformer.logic;

import pl.put.poznan.transformer.logic.decorators.CapitalizeDecorator;
import pl.put.poznan.transformer.logic.decorators.DoubleDecorator;
import pl.put.poznan.transformer.logic.decorators.LowerDecorator;
import pl.put.poznan.transformer.logic.decorators.UpperDecorator;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class TextTransformer {

    private final String[] transforms;

    private AbstractInput stringInput;

    public TextTransformer(String[] transforms, String text ) {
        this.transforms = transforms;
        this.stringInput = new TextInput(text);
    }


    public void setStringInput(String text) {
        this.stringInput = new TextInput(text);
    }

    public String upperTransform() {
        this.stringInput = new UpperDecorator(stringInput);
        return this.stringInput.getText();
    }

    public String lowerTransform() {
        this.stringInput = new LowerDecorator(stringInput);
        return this.stringInput.getText();
    }

    public String capitalTransform() {
        this.stringInput = new CapitalizeDecorator(stringInput);
        return this.stringInput.getText();
    }

    public String doubleTransform() {
        this.stringInput = new DoubleDecorator(stringInput);
        return this.stringInput.getText();
    }

    public String getInputText() {
        return stringInput.getText();
    }

    public String transform() {
        for (String transform : transforms) {
            switch (transform) {
                case "upper": {
                    upperTransform();
                    break;
                }
                case "lower": {
                    lowerTransform();
                    break;
                }
                case "capital": {
                    capitalTransform();
                    break;
                }
                case "deldouble": {
                    doubleTransform();
                    break;
                }

                default: {
                    break;
                }
            }
        }
    return stringInput.getText();
    }

}


