package com.springinaction.springidol.performers;


import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.magicBox.MagicBox;

public class Magician implements Performer {
    // внедрение
    private MagicBox magicBox;
    private String magicWords;

    public Magician() {
    }

    public void perform() throws PerformanceException {
        System.out.println(magicWords);
        System.out.println("The magic box contains...");
        System.out.println(magicBox.getContents()); // Исследует содержимое

    } // ящика

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox; // Внедрение волшебного ящика
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }


}