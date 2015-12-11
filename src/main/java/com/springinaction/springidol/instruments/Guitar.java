package com.springinaction.springidol.instruments;

//@StringedInstrument

import com.springinaction.springidol.instruments.Instrument;
import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
    public Guitar() {
    }

    public void play() {
        System.out.println("TRIP TRIP TRIP TRIP");
    }
}