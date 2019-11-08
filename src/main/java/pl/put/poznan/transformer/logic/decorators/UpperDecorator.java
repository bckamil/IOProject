package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

/**
 * wszystkie litery na wielkie: upper -> UPPER
 */
public class UpperDecorator extends AbstractDecorator {

    public UpperDecorator(AbstractInput inputText) {
        super(inputText);
    }

    @Override
    public String getText()
    {

        return inputText.getText().toUpperCase();
    }


}