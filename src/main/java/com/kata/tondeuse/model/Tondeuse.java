package com.kata.tondeuse.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tondeuse {
    private int x;
    private int y ;
    private char direction;
}
