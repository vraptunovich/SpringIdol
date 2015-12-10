package com.springinaction.springidol.jugglers;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.poems.Poem;

public class PoeticJuggler extends Juggler {
    private Poem poem;
    public PoeticJuggler(Poem poem) { // Внедрение поэмы
        super();
        this.poem = poem;
    }
    public PoeticJuggler( int beanBags,  Poem poem) { // Внедрение количества
        super(beanBags); // мячиков и поэмы
        this.poem = poem;
    }
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}