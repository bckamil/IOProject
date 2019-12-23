package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

public class UnfoldDecorator extends AbstractDecorator{


    static String[] shortcuts = { "prof.", "dr.", "np.", "itd."};

    public UnfoldDecorator(AbstractInput inputText)
    {
        super(inputText);
    }

    //TODO: 1. Copy string, 2. lower copy, 3. search shortcut in string using substrings, 4. get index,
    // 5. get substring and replace it using replace string method in original string with capital check 6. return

    @Override
    public String getText() {

        return inputText.getText();
    }
}
