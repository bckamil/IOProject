package pl.put.poznan.transformer.logic;
import org.junit.Test;
import junit.framework.TestCase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TextTransformerUpperTest extends TestCase {
    @Test
    public void test() {
        String[] transform = new String[1];
        transform[0] = "upper";
        TextTransformer test = new TextTransformer(transform,"ala");
        test.transform();
        assertEquals("ALA",test.getInputText());
    }
    @Test
    public void test2() {
        String[] transform = new String[1];
        transform[0] = "upper";
        TextTransformer test = new TextTransformer(transform,"ala ma Kota");
        test.transform();
        assertEquals("ALA MA KOTA",test.getInputText());
    }
    @Test
    public void test3() {
        String[] transform = new String[1];
        transform[0] = "upper";
        TextTransformer test = new TextTransformer(transform,"ALA");
        test.transform();
        assertEquals("ALA",test.getInputText());
    }
    @Test
    public void test4() {
        TextTransformer mockObject = mock(TextTransformer.class);
        when(mockObject.upperTransform()).thenReturn("Alo");
        assertEquals("Inverse base test", "Alo",mockObject.upperTransform());
    }

}