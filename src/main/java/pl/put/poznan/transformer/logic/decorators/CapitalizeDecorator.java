package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

/**
 *  pierwsza litera w każdym wyrazie na wielką: capitalize text -> Capitalize Text
 */
public class CapitalizeDecorator extends AbstractDecorator {

    public CapitalizeDecorator(AbstractInput inputText) {
        super(inputText);

    }

    @Override
    public String getText() {

        String[] tempString = inputText.getText().split(" ");

        for (int j = 0; j < tempString.length; j++)
            tempString[j] = tempString[j].substring(0, 1).toUpperCase() +
                    tempString[j].substring(1).toLowerCase();

        return String.join(" ", tempString);

    }



}
