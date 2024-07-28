package com.kata.tondeuse.reader;

import com.kata.tondeuse.model.Tondeuse;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

@Component
public class TondeuseItemReader implements ItemReader {
    @Override
    public Tondeuse read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return new Tondeuse(0,0,'N');
    }
}
