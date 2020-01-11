package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

/**
 * Latex Decorator
 * It takes any object that inherit from AbstractInput class
 * and modify its previous method getText() to Latex format
 *
 * @author xDestian
 * @see pl.put.poznan.transformer.logic.decorators.AbstractDecorator
 */

public class LatexDecorator extends AbstractDecorator {
    /**
     * Constructor
     * It takes any object that inherit from AbstractInput class
     * @param inputText
     */

    public LatexDecorator(AbstractInput inputText){super(inputText);}


    /**
     * Override getText() method
     * @return Returns base text in LaTeX format
     */
    @Override
    public String getText() {
        String inputString = inputText.getText();
        String finalString = inputString
                .replace("$","\\$")
                .replace("&","\\&");
        return finalString;

    }
}
