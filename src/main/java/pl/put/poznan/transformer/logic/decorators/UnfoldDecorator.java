package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

/**
 * UnfoldDecorator
 *
 * Replace some pre-implemented text values into another -> short versions to full long
 *
 * @author marek
 * @see pl.put.poznan.transformer.logic.decorators.AbstractDecorator
 *
 *
 */
public class UnfoldDecorator extends AbstractDecorator{


    /**
     * shortcuts stores short versions of shortcuts to convert
     */
    static String[] shortcuts = { "prof.", "dr.", "np.", "itd."};
    /**
     * sentences stores full veriosn of shortcuts
     */
    static String[] sentences = { "profesor", "doktor", "na przykład", "i tym podobne"};

    /**
     * Constructor of UnfoldDecorator
     * It takes any object that inherit from AbstractInput class,
     * and modify its previous method getText()
     *
     * @param inputText base object to transform
     */
    public UnfoldDecorator(AbstractInput inputText)
    {
        super(inputText);
    }


    /**
     *  Override getText() method
     *  Replace shortcut with full long version of text
     *
     * @return original text with folded phrases
     */
    @Override
    public String getText() {


        String tempText = inputText.getText();
        String textCopy = tempText.toLowerCase();

        for (int counter = 0; counter< sentences.length ; counter++) {
            int i = 0;
            while (true) {
                int index = textCopy.indexOf(shortcuts[counter], i);
                if (index == -1)
                    break;
                else {
                    if(Character.isUpperCase(tempText.charAt(index))){
                        tempText = tempText.substring(0,index) + sentences[counter].substring(0,1).toUpperCase()+
                                sentences[counter].substring(1) + tempText.substring(index+shortcuts[counter].length());
                    }else{
                        tempText = tempText.substring(0,index) + sentences[counter] + tempText.substring(index+shortcuts[counter].length());
                    }

                    textCopy = tempText.toLowerCase();

                }
            }
        }
        return tempText;
    }
}
