package com.kata.tondeuse.writer;

import com.kata.tondeuse.model.Tondeuse;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TondeuseItemWriter implements ItemWriter<List<Tondeuse>> {

    @Override
    public void write(Chunk<? extends List<Tondeuse>> items) throws Exception {
        items.forEach(tondeuse -> System.out.println(tondeuse));
    }
}
