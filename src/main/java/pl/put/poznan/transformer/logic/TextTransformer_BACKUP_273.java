package pl.put.poznan.transformer.logic;

<<<<<<< HEAD


import pl.put.poznan.transformer.logic.decorators.*;
=======
import pl.put.poznan.transformer.logic.decorators.CapitalizeDecorator;
import pl.put.poznan.transformer.logic.decorators.DoubleDecorator;
import pl.put.poznan.transformer.logic.decorators.LowerDecorator;
>>>>>>> master
import pl.put.poznan.transformer.logic.decorators.UpperDecorator;
import pl.put.poznan.transformer.logic.decorators.InverseDecorator;

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
<<<<<<< HEAD
    public String numberTransform(){
        this.stringInput = new NumericalDecorator(stringInput);
=======
    
    public String inverseTransform(){
        this.stringInput = new InverseDecorator(stringInput);
>>>>>>> master
        return this.stringInput.getText();
    }

    public String getInputText() {
        return stringInput.getText();
    }

<<<<<<< HEAD
=======
    /**
     * Function to chose method to execute and to transform text by dynamical type assign
     *
     * @return  String transformed text
     */
>>>>>>> master
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
<<<<<<< HEAD
                case "number":{
                    numberTransform();
=======
                case "inverse":
                {
                    inverseTransform();
>>>>>>> master
                    break;
                }

                default: {
                    break;
                }
            }
        }
<<<<<<< HEAD
        return stringInput.getText();
=======
    return stringInput.getText();
>>>>>>> master
    }

}


