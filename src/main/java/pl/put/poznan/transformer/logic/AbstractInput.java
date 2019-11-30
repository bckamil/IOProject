package pl.put.poznan.transformer.logic;

/**
 *
 * Template for TextInput class
 * @author marek
 *
 *
 */
abstract public class AbstractInput {
    /**
     * It is text to compute
     */
    protected String text;

    /**
     * Basic methond getText()
     *
     * @return It returns text String filed of object
     */
    public String getText()
    {
        return this.text;
    }

    /**
     * Basic method setText()
     * to manually set String text
     *
     * @param text String, sets class text field with text input param
     */
    public void setText(String text)
    {
        this.text = text;
    }

}
