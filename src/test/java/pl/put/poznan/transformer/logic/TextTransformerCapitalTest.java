package pl.put.poznan.transformer.logic;
import org.junit.Test;
import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
    @Test
    public void test4() {
        TextTransformer mockObject = mock(TextTransformer.class);
        when(mockObject.capitalTransform()).thenReturn("Alo");
        assertEquals("Inverse base test", "Alo",mockObject.capitalTransform());
    }

}