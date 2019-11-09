package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

/**
 * CapitalizeDecorator transform text to capitalize firs char of any word in text

 *  Pierwsza litera w każdym wyrazie na wielką: capitalize text -> Capitalize Text
 *
 *  @author marek
 *  @see pl.put.poznan.transformer.logic.decorators.AbstractDecorator
 */
public class CapitalizeDecorator extends AbstractDecorator {

    /**
     * Constructor of CapitalizeDecorator
     * It takes any object that inherit from AbstractInput class,
     * and modify its previous method getText()

     * @param inputText base object to transform
     */

    public CapitalizeDecorator(AbstractInput inputText) {
        super(inputText);

    }

    /**
     * Override getText() method
     *
     * ex. capitalize text -> Capitalize Text
     * @return  Returns base text but every word starts with capital letter
     *
     */
    @Override
    public String getText() {
        //TODO: Przy inpucie "Oh zwraca "oh bo pierwszym znakiem jest ". Pytanie czy tak może być?
        String[] tempString = inputText.getText().split(" ");

        for (int j = 0; j < tempString.length; j++)
            tempString[j] = tempString[j].substring(0, 1).toUpperCase() +
                    tempString[j].substring(1).toLowerCase();

        return String.join(" ", tempString);

    }



}
