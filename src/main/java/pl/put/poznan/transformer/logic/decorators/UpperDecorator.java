package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

/**
 * UpperDecorator
 *  It takes any object that inherit from AbstractInput class,
 *  and modify its previous method getText() to transform text characters to upper case
 *
 * wszystkie litery na wielkie: upper zmienia na UPPER
 *
 * @author marek
 * @see pl.put.poznan.transformer.logic.decorators.AbstractDecorator
 */
public class UpperDecorator extends AbstractDecorator {

    /**
     * Constructor of UpperDecorator
     * It takes any object that inherit from AbstractInput class,
     * and modify its previous method getText()
     *
     * @param inputText base object to transform
     */
    public UpperDecorator(AbstractInput inputText) {
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

        return inputText.getText().toUpperCase();
    }


}