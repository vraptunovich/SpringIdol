package com.springinaction.springidol.instruments;


import com.springinaction.springidol.qualifiers.StringedInstrument;
import com.springinaction.springidol.qualifiers.Strummed;

@StringedInstrument
@Strummed
 public class HammeredDulcimer implements Instrument {
    public HammeredDulcimer() {
    }

    public void play() {
        System.out.println("TCHIP TCHIP TCHIP TCHIP");
    }
}