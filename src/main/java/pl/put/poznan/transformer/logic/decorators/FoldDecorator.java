package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

public class FoldDecorator extends AbstractDecorator {

    static String[] shortcuts = { "np.", "m.in.", "itd."};
    static String[] sentences = {"na przykład", "między innymi", "i tym podobne"};

//    TODO: 1. copy string, 2. lower copy, 3. find position of sentence 3. in original string replace by index
    public FoldDecorator(AbstractInput inputText)
    {
        super(inputText);
    }


    @Override
    public String getText() {

        return inputText.getText();
    }
}
