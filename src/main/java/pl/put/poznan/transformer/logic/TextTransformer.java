package pl.put.poznan.transformer.logic;

import pl.put.poznan.transformer.logic.decorators.*;

/**
 * This class manage text transforms
 *
 * @author krystian
 * @author marek
 * @author mariusz
 * @author kamil
 *
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
    
    public String inverseTransform(){
        this.stringInput = new InverseDecorator(stringInput);
        return this.stringInput.getText();
    }
    public String numberTransform(){
        this.stringInput = new NumericalDecorator(stringInput);
        return this.stringInput.getText();
    }

    public String foldTransform(){
        this.stringInput = new FoldDecorator(stringInput);
        return this.stringInput.getText();
    }
    public String unfoldTransform(){
        this.stringInput = new UnfoldDecorator(stringInput);
        return this.stringInput.getText();
    }

    public String getInputText() {
        return stringInput.getText();
    }

    /**
     * Function to chose method to execute and to transform text by dynamical type assign
     *
     * @return  String transformed text
     */
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
                case "inverse":
                {
                    inverseTransform();
                    break;
                }
                case "fold":
                {
                    foldTransform();
                    break;
                }
                case "unfold":
                {
                    unfoldTransform();
                    break;
                }
                case "number":
                {
                    numberTransform();
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


