package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

/**
 * Abstract Decorator
 *
 * @author marek
 * @see pl.put.poznan.transformer.logic.AbstractInput
 *
 */
abstract class AbstractDecorator extends AbstractInput {

    public AbstractInput inputText;

    public AbstractDecorator(AbstractInput inputText)
    {
        this.inputText = inputText;
    }

    @Override
    public abstract String getText();
}
