package pl.put.poznan.transformer.logic;
import org.junit.Test;
import junit.framework.TestCase;

public class TextTransformerCapitalTest extends TestCase {
    @Test
    public void test() {
        String[] transform = new String[1];
        transform[0] = "capital";
        TextTransformer test = new TextTransformer(transform,"ala");
        test.transform();
        assertEquals("Ala",test.getInputText());
    }
    @Test
    public void test2() {
        String[] transform = new String[1];
        transform[0] = "capital";
        TextTransformer test = new TextTransformer(transform,"Ala");
        test.transform();
        assertEquals("Ala",test.getInputText());
    }
    @Test
    public void test3() {
        String[] transform = new String[1];
        transform[0] = "capital";
        TextTransformer test = new TextTransformer(transform,"ala ma kota");
        test.transform();
        assertEquals("Ala Ma Kota",test.getInputText());
    }

}