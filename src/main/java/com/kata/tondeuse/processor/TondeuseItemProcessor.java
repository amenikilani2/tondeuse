package com.kata.tondeuse.processor;

import com.kata.tondeuse.model.Tondeuse;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class TondeuseItemProcessor implements ItemProcessor<Tondeuse, Tondeuse> {

    @Override
    public Tondeuse process(Tondeuse tondeuse) throws Exception {
        tondeuse.setX(tondeuse.getX() + 1);
        return tondeuse;
    }
}
