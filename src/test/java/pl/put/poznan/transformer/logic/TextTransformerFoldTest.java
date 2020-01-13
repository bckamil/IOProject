package pl.put.poznan.transformer.logic;
import org.junit.Test;
import junit.framework.TestCase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TextTransformerFoldTest extends TestCase {
    @Test
    public void test() {
        String[] transform = new String[1];
        transform[0] = "fold";
        TextTransformer test = new TextTransformer(transform,"na przykład");
        test.transform();
        assertEquals("np.",test.getInputText());
    }
    @Test
    public void test2() {
        String[] transform = new String[1];
        transform[0] = "fold";
        TextTransformer test = new TextTransformer(transform,"Gosia jadła kanapki i tym podobne rzeczy na śniadanie.");
        test.transform();
        assertEquals("Gosia jadła kanapki itd. rzeczy na śniadanie.",test.getInputText());
    }
    public void test3() {
        String[] transform = new String[1];
        transform[0] = "fold";
        TextTransformer test = new TextTransformer(transform,"Zwierzęta między innymi koty.");
        test.transform();
        assertEquals("Zwierzęta m.in. koty.",test.getInputText());
    }
    @Test
    public void test4() {
        TextTransformer mockObject = mock(TextTransformer.class);
        when(mockObject.foldTransform()).thenReturn("Alo");
        assertEquals("Inverse base test", "Alo",mockObject.foldTransform());
    }
}