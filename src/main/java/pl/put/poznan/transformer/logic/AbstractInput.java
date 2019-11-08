package pl.put.poznan.transformer.logic;

/**
 *
 */
abstract public class AbstractInput {
    protected String text;


    public String getText()
    {
        return this.text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

}
