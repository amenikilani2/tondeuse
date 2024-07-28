package com.kata.tondeuse.processor;

import com.kata.tondeuse.model.Tondeuse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TondeuseItemProcessorTest {

    @Test
    public void testProcess() throws Exception {
        Tondeuse tondeuse = new Tondeuse(0,0,'N');
        TondeuseItemProcessor processor = new TondeuseItemProcessor();
        Tondeuse processedTondeuse = processor.process(tondeuse);
        assertEquals(1, processedTondeuse.getX());
        assertEquals(0, processedTondeuse.getY());
    }
}
