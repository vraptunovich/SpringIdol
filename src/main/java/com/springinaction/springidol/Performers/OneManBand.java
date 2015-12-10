package com.springinaction.springidol.Performers;

import com.springinaction.springidol.Exceptions.PerformanceException;
import com.springinaction.springidol.instruments.Instrument;

import java.util.Collection;

public class OneManBand implements Performer {
    public OneManBand() {
    }


    public void perform() throws PerformanceException {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
    private Collection<Instrument> instruments;
    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments; // Внедрение коллекции инструментов
    }
}