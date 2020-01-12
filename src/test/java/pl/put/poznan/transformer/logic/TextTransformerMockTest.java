package pl.put.poznan.transformer.logic;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import org.junit.Test;
import pl.put.poznan.transformer.logic.decorators.CapitalizeDecorator;

public class TextTransformerMockTest{
    @Test
    public void mockTest() {
        TextTransformer mockObject = mock(TextTransformer.class);
        when(mockObject.inverseTransform()).thenReturn("Alo");
        assertEquals("Inverse base test", "Alo",mockObject.inverseTransform());
    }
    @Test
    public void mockTest2() {
        TextTransformer mockObject = mock(TextTransformer.class);
        when(mockObject.inverseTransform()).thenReturn("Alo");
        assertEquals("Inverse base test", "Alo",mockObject.inverseTransform());
    }

}