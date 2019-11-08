package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

/**
 * wszystkie litery na małe: Lower -> lower
 */
public class LowerDecorator extends AbstractDecorator {

    public LowerDecorator(AbstractInput inputText) {
        super(inputText);

    }

    @Override
    public String getText()
    {
        return inputText.getText().toLowerCase();
    }

}
