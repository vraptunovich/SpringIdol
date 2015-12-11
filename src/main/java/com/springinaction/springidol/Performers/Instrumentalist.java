package com.springinaction.springidol.performers;


import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.instruments.Instrument;
import org.springframework.beans.factory.annotation.Autowired;

//@Component("asd")
public class Instrumentalist implements Performer {
    private String song="Opa Opa";
    //@StringedInstrument
    //@Strummed
    // @Named("guitar")
   @Autowired

    private Instrument instrument;

    public Instrumentalist() {
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;

    }

    public String screamSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument; // инструмента
    }
}