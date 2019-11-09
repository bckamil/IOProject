package pl.put.poznan.transformer.logic.decorators;

import pl.put.poznan.transformer.logic.AbstractInput;

import java.util.ArrayList;

/**
 * Usuwa powtarzające się wyrazy w najbliższym sąsiedztwie
 * @author krystian
 */

public class DoubleDecorator extends AbstractDecorator{

    public DoubleDecorator(AbstractInput inputText)
    {
        super(inputText);
    }

    @Override
    public String getText() {
        String workString = inputText.getText();
        String[] splittedText = workString.split(" ");
        int textLen = splittedText.length;
        ArrayList<String> finalText = new ArrayList<>();
        finalText.add(splittedText[0]);
        for(int i=1; i<textLen-1;i++)
        {
            if (splittedText[i-1].equals(splittedText[i])){continue;}
            else{finalText.add(splittedText[i]);}

        }
        return String.join(" ",finalText);
    }


}
