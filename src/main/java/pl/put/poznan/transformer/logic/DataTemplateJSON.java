package pl.put.poznan.transformer.logic;

/**
 * Template for JSON
 *
 *
 * @author marek
 */
public class DataTemplateJSON {

    private String[] transforms;
    private String text;


    public DataTemplateJSON() {
    }

    public DataTemplateJSON(String[] transforms, String text) {
        this.transforms = transforms;
        this.text = text;
    }

    public String[] getTransforms() {
        return transforms;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
