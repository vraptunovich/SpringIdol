package com.springinaction.springidol.Jugglers;

import com.springinaction.springidol.Exceptions.PerformanceException;
import com.springinaction.springidol.Performers.Performer;

public class Juggler implements Performer {
    private int beanBags = 3;
    public Juggler() {
    }
    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}