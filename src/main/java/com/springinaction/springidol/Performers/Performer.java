package com.springinaction.springidol.Performers;

import com.springinaction.springidol.Exceptions.PerformanceException;

public interface Performer {
    void perform() throws PerformanceException;
}