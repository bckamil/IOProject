package pl.put.poznan.transformer.logic;
import org.junit.Test;
import junit.framework.TestCase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TextTransformerNumericTest extends TestCase {
    @Test
    public void test() {
        String[] transform = new String[1];
        transform[0] = "number";
        TextTransformer test = new TextTransformer(transform,"202 kotki");
        test.transform();
        assertEquals("dwieście dwa kotki",test.getInputText());
    }
    @Test
    public void test2() {
        String[] transform = new String[1];
        transform[0] = "number";
        TextTransformer test = new TextTransformer(transform,"420");
        test.transform();
        assertEquals("czterysta dwadzieścia",test.getInputText());
    }
    @Test
    public void test3() {
        String[] transform = new String[1];
        transform[0] = "number";
        TextTransformer test = new TextTransformer(transform,"6 9 7");
        test.transform();
        assertEquals("sześć dziewięć siedem",test.getInputText());
    }
    @Test
    public void test4() {
        TextTransformer mockObject = mock(TextTransformer.class);
        when(mockObject.numberTransform()).thenReturn("Alo");
        assertEquals("Inverse base test", "Alo",mockObject.numberTransform());
    }
}