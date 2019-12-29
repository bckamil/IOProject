package pl.put.poznan.transformer.logic.decorators;


import pl.put.poznan.transformer.logic.AbstractInput;
import java.util.ArrayList;

/**
 * FoldDecorator
 *
 * Replace some pre-implemented text values into another -> long veriosns to shortcut.
 *
 * @author marek
 * @see pl.put.poznan.transformer.logic.decorators.AbstractDecorator
 *
 *
 */
public class FoldDecorator extends AbstractDecorator {


    /**
     * Sentences array stores unfolded version of shortcuts that we want to fold.
     */
    static String[] sentences = {"na przykład", "między innymi", "i tym podobne"};
    /**
     *  shortcuts array stores folded version of sentences
     */
    static String[] shortcuts = { "np.", "m.in.", "itd."};



    /**
     * Constructor of FoldDecorator
     * It takes any object that inherit from AbstractInput class,
     * and modify its previous method getText()
     *
     * @param inputText base object to transform
     */
    public FoldDecorator(AbstractInput inputText)
    {
        super(inputText);
    }

    /**
     *  Override getText() method
     *
     *  Function search predifined words in lowercase ver. of Original  text and replace them in original text.
     * @return original text with folded phrases
     */
    @Override
    public String getText() {


        String tempText = inputText.getText();
        String textCopy = tempText.toLowerCase();

        for (int counter = 0; counter<3; counter++) {
            int i = 0;
            while (true) {
                int index = textCopy.indexOf(sentences[counter], i);
                if (index == -1)
                    break;
                else {
                    tempText = tempText.substring(0,index) + shortcuts[counter] + tempText.substring(index+sentences[counter].length());
                    textCopy = tempText.toLowerCase();

                }
            }
        }

        return tempText;
    }
}
