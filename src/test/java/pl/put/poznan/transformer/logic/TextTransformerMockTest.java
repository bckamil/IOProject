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
        assertEquals("Inverse base test", null,mockObject.inverseTransform());
    }


}