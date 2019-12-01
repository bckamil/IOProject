package pl.put.poznan.transformer.logic.decorators;
import pl.put.poznan.transformer.logic.AbstractInput;


/**
 * InverseDecorator
 *  It takes any object that inherit from AbstractInput class,
 *  and modify its previous method getText() to transform text characters to inverse case
 *
 * zmienia kolejnosc znakow zachowujac ich wielkosc na konkretnych miejscach MirEk zmienia na KerIm
 *
 * @author mariusz
 * @see pl.put.poznan.transformer.logic.decorators.AbstractDecorator
 */
public class InverseDecorator extends AbstractDecorator {

    /**
     * Constructor of inverseDecorator
     * It takes any object that inherit from AbstractInput class,
     * and modify its previous method getText()
     *
     * @param inputText base object to transform
     */
    public InverseDecorator(AbstractInput inputText) {
        super(inputText);
    }


    /**
     * Override getText() method
     *
     * @return  Returns base text in upper case.
     */
    @Override
    public String getText()
    {
         String result="";
         for(int i=inputText.getText().length()-1; i>=0; i--) {
            if(Character.isUpperCase(inputText.getText().charAt(inputText.getText().length()-1-i)))
            {
                result = result + Character.toUpperCase(inputText.getText().charAt(i));
            }
            else
            {
                result = result + Character.toLowerCase(inputText.getText().charAt(i));    
            }
            
        }
    return result;
    }


}