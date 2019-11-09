package pl.put.poznan.transformer.logic;



import pl.put.poznan.transformer.logic.decorators.CapitalizeDecorator;
import pl.put.poznan.transformer.logic.decorators.LowerDecorator;


import pl.put.poznan.transformer.logic.decorators.UpperDecorator;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class TextTransformer {

    private final String[] transforms;

    private AbstractInput stringInput;

    public TextTransformer(String[] transforms){
        this.transforms = transforms;
    }
    public void initializeInput(String text){
        this.stringInput = new TextInput(text);
    }

    public String upperTransform(){
        this.stringInput = new UpperDecorator(stringInput);
        return this.stringInput.getText();
    }


    public String transform(String text){
        // of course normally it would to something based on transforms
//        return text.toUpperCase();

        return text;
    }

}
