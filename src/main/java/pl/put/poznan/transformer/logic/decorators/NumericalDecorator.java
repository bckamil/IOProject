package pl.put.poznan.transformer.logic.decorators;
import java.util.ArrayList;
import java.util.HashMap;
import pl.put.poznan.transformer.logic.AbstractInput;

/**
 * NumericalDecorator
 * It taks any object that inherit from AbstractInput class
 * and modify its previous method getText() to transform numbers in text
 * into words in Polish
 *
 * @author Krystian
 * @see pl.put.poznan.transformer.logic.decorators.AbstractDecorator
 */
public class NumericalDecorator extends AbstractDecorator{

    private String[] tab1 = {"sto","dwieście","trzysta","czterysta","pięćset","sześćset","siedemset","osiemset",
            "dziewięćset"};
    private String[] tab2 = {"dwadzieścia","trzydzieści","czterdzieści","pięćdziesiąt","sześćdziesiąt","siedemdziesiąt",
    "osiemdziesiąt","dziewięćdziesiąt"};
    private String[] tab3 = {"dziesięć","jedenaście","dwanaście","trzynaście","czternaście","piętnaście","szesnaście",
    "siedemnaście","osiemnaście","dziewiętnaście"};
    private String[] tab4 = {"zero","jeden","dwa","trzy","cztery","pięć","sześć","siedem","osiem","dziewięć"};
    private String[] tab5 = {"jedna","dwie"};

    /**
     * Constructor of inverseDecorator
     * It takes any object that inherit from AbstractInput class
     * and modify its previous method getText()
     * @param inputText
     */
    public NumericalDecorator(AbstractInput inputText) {
        super(inputText);
    }

    /**
     * Override getText() method
     *
     * @return Return text with numbers converted to words
     */
    public String getText()
    {
        String workString = inputText.getText();
        boolean numericNo = true;
        String[] splittedText = workString.split(" ");
        ArrayList<String> finalText = new ArrayList<>();
        for (String temp : splittedText)
        {
            try {
                double number = Double.parseDouble(temp);
                numericNo=false;

            }catch(NumberFormatException e)
            {
                numericNo = true;
            }
            if (numericNo){finalText.add(temp);}
            else{
                String firstPart = "";
                String secondPart = "";
                boolean nextPart = false;
                int secondCount = 0;
                int wordLength = temp.length();
                for (int i = 0; i<wordLength; i++)
                {
                    if(temp.charAt(i)=='.')
                    {
                        nextPart = true;
                        continue;
                    }
                    if (nextPart){
                        secondPart+=temp.charAt(i);
                        secondCount+=1;
                        if (secondCount==2){break;}
                    }
                    else{firstPart+=temp.charAt(i);}

                }
                int parseFirst = Integer.parseInt(firstPart);
                int parseSecond = 0;
                if (!secondPart.equals("")) {
                    parseSecond = Integer.parseInt(secondPart);
                }

                int h1 = parseFirst/100;
                int d1 = (parseFirst%100)/10;
                int o1 = parseFirst%10;

                int d2 = parseSecond/10;
                int o2 = parseSecond%10;

                if (h1!=0)finalText.add(tab1[h1-1]);
                if (d1>=2)finalText.add(tab2[d1-2]);
                if (d1==1)finalText.add(tab3[o1]);
                if (d1!=1 && o1!=0)finalText.add(tab4[o1]);
                if (d2>0 && d2<=2){
                    finalText.add(tab5[d2-1]);
                    switch(d2) {
                        case 1:
                            finalText.add("dziesiąta");
                        case 2:
                            finalText.add("dziesiąte");
                    }

                }
                if (d2 > 2) {
                    finalText.add(tab4[d2]);
                    if (d2>2 && d2<5)finalText.add("dziesiąte");

                    else finalText.add("dziesiątych");
                }
                if (o2!=0) {
                    finalText.add("i");
                    if (o2<=2) finalText.add(tab5[o2-1]);
                    else finalText.add(tab4[o2]);
                    if (o2==1)finalText.add("setna");
                    if (o2>=2 && o2<=4)finalText.add("setne");
                    if (o2>=5)finalText.add("setnych");
                }





            }

        }

        return String.join(" ",finalText);
    }
}