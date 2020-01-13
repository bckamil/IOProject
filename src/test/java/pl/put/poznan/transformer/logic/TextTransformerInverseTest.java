package pl.put.poznan.transformer.logic;
import org.junit.Test;
import junit.framework.TestCase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TextTransformerInverseTest extends TestCase {
    @Test
    public void test() {
        String[] transform = new String[1];
        transform[0] = "inverse";
        TextTransformer test = new TextTransformer(transform,"Kota");
        test.transform();
        assertEquals("Atok",test.getInputText());
    }
    @Test
    public void test2() {
        String[] transform = new String[1];
        transform[0] = "inverse";
        TextTransformer test = new TextTransformer(transform,"MirEk");
        test.transform();
        assertEquals("KerIm",test.getInputText());
    }
    @Test
    public void test3() {
        String[] transform = new String[1];
        transform[0] = "inverse";
        TextTransformer test = new TextTransformer(transform,"kon");
        test.transform();
        assertEquals("nok",test.getInputText());
    }
    @Test
    public void test4() {
        TextTransformer mockObject = mock(TextTransformer.class);
        when(mockObject.inverseTransform()).thenReturn("Alo");
        assertEquals("Inverse base test", "Alo",mockObject.inverseTransform());
    }

}