package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

/**
 * LowerDecorator
 * It takes any object that inherit from AbstractInput class,
 * and modify its previous method getText() to transform text characters to lower case
 *
 * Wszystkie litery na małe: Lower zmienia na lower
 *
 * @author marek
 * @see pl.put.poznan.transformer.logic.decorators.AbstractDecorator
 */
public class LowerDecorator extends AbstractDecorator {

    /**
     * Constructor of LowerDecorator
     * It takes any object that inherit from AbstractInput class,
     * and modify its previous method getText()
     *
     * @param inputText base object to transform
     */
    public LowerDecorator(AbstractInput inputText) {
        super(inputText);

    }

    /**
     * Override getText() method
     *
     * @return Returns base text in lower case
     */
    @Override
    public String getText()
    {
        return inputText.getText().toLowerCase();
    }

}
