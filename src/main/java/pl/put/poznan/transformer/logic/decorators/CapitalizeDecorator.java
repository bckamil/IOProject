package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

/**
 * CapitalizeDecorator transform text to capitalize firs char of any word in text
 * <p>
 * Pierwsza litera w każdym wyrazie na wielką: capitalize text -> Capitalize Text
 *
 * @author marek
 * @see pl.put.poznan.transformer.logic.decorators.AbstractDecorator
 */
public class CapitalizeDecorator extends AbstractDecorator {

    /**
     * Constructor of CapitalizeDecorator
     * It takes any object that inherit from AbstractInput class,
     * and modify its previous method getText()
     *
     * @param inputText base object to transform
     */

    public CapitalizeDecorator(AbstractInput inputText) {
        super(inputText);

    }

    /**
     * Override getText() method
     * <p>
     * ex. capitalize text -> Capitalize Text
     *
     * @return Returns base text but every word starts with capital letter
     */
    @Override
    public String getText() {

        String[] tempString = inputText.getText().split(" ");
        for (int j = 0; j < tempString.length; j++)

            for (int i = 0; i < tempString[j].length(); i++) {

                if (Character.isLetter(tempString[j].charAt(i))) {
                    if (i == 0) {
                        tempString[j] = tempString[j].substring(0, 1).toUpperCase() +
                                tempString[j].substring(1).toLowerCase();
                    } else {
                        tempString[j] = tempString[j].substring(0, i + 1).toUpperCase() +
                                tempString[j].substring(i + 1).toLowerCase();
                    }
                    break;

                }
            }

        return String.join(" ", tempString);

    }


}
