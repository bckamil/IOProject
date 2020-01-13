package pl.put.poznan.transformer.logic;
import org.junit.Test;
import junit.framework.TestCase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TextTransformerDoubleTest extends TestCase {
    @Test
    public void test() {
        String[] transform = new String[1];
        transform[0] = "deldouble";
        TextTransformer test = new TextTransformer(transform,"pa pa pa");
        test.transform();
        assertEquals("pa",test.getInputText());
    }
    @Test
    public void test2() {
        String[] transform = new String[1];
        transform[0] = "deldouble";
        TextTransformer test = new TextTransformer(transform,"Ala ma kota kota");
        test.transform();
        assertEquals("Ala ma kota",test.getInputText());
    }
    @Test
    public void test3() {
        String[] transform = new String[1];
        transform[0] = "deldouble";
        TextTransformer test = new TextTransformer(transform,"ala ma kota");
        test.transform();
        assertEquals("ala ma kota",test.getInputText());
    }
    @Test
    public void test4() {
        TextTransformer mockObject = mock(TextTransformer.class);
        when(mockObject.doubleTransform()).thenReturn("Alo");
        assertEquals("Inverse base test", "Alo",mockObject.doubleTransform());
    }

}