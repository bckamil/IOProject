package pl.put.poznan.transformer.logic;
import org.junit.Test;
import junit.framework.TestCase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TextTransformerLatexTest extends TestCase {
    @Test
    public void test() {
        String[] transform = new String[1];
        transform[0] = "latex";
        TextTransformer test = new TextTransformer(transform,"John Smith & Sons");
        test.transform();
        assertEquals("John Smith \\& Sons",test.getInputText());
    }
    @Test
    public void test2() {
        String[] transform = new String[1];
        transform[0] = "latex";
        TextTransformer test = new TextTransformer(transform,"to kosztuje 30$");
        test.transform();
        assertEquals("to kosztuje 30\\$",test.getInputText());
    }
    @Test
    public void test3() {
        String[] transform = new String[1];
        transform[0] = "latex";
        TextTransformer test = new TextTransformer(transform,"kon");
        test.transform();
        assertEquals("kon",test.getInputText());
    }
    @Test
    public void test4() {
        TextTransformer mockObject = mock(TextTransformer.class);
        when(mockObject.latexTransform()).thenReturn("Alo");
        assertEquals("Inverse base test", "Alo",mockObject.latexTransform());
    }

}