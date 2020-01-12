package pl.put.poznan.transformer.logic;
import org.junit.Test;
import junit.framework.TestCase;

public class TextTransformerLowerTest extends TestCase {
    @Test
    public void test() {
        String[] transform = new String[1];
        transform[0] = "lower";
        TextTransformer test = new TextTransformer(transform,"ALA");
        test.transform();
        assertEquals("ala",test.getInputText());
    }
    @Test
    public void test2() {
        String[] transform = new String[1];
        transform[0] = "lower";
        TextTransformer test = new TextTransformer(transform,"ALA MA KOTA");
        test.transform();
        assertEquals("ala ma kota",test.getInputText());
    }
    @Test
    public void test3() {
        String[] transform = new String[1];
        transform[0] = "lower";
        TextTransformer test = new TextTransformer(transform,"ala");
        test.transform();
        assertEquals("ala",test.getInputText());
    }
}