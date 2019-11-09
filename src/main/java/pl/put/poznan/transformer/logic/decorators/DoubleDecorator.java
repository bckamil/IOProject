package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

import java.util.ArrayList;

/**
 * DoubleDecorator
 * It takes any object that inherit from AbstractInput class
 * and modify its previous method getText() to remove multiplications
 * of adjacent words
 *
 * @author krystian
 *
 * @see pl.put.poznan.transformer.logic.AbstractInput
 */

public class DoubleDecorator extends AbstractDecorator{

    /**
     * Constructor of DoubleDecorator
     * It takes any object that inherit from AbstractInput class
     * and modify its previous method getText()
     *
     * @param inputText base object to transform
     */
    public DoubleDecorator(AbstractInput inputText)
    {
        super(inputText);
    }

    /**
     * Override getText() method
     *
     * @return Returns base text with removed multiplied adjacent words
     *
     */
    @Override
    public String getText() {
        String workString = inputText.toString();
        String[] splittedText = workString.split(" ");
        int textLen = splittedText.length;
        ArrayList<String> finalText = new ArrayList<>();
        finalText.add(splittedText[0]);
        for(int i=1; i<textLen-1;i++)
        {
            if (splittedText[i-1].equals(splittedText[i])){continue;}
            else{finalText.add(splittedText[i]);}

        }
        return String.join(" ",finalText);
    }


}