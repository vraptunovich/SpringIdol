package com.springinaction.springidol.cites;

public class City {
    private String name;
    private String state;
    private int population;

    public City() {
    }

    @Override
    public String toString() {
        return "Город: "+name+"; Штат: "+state+"; Население: "+population+";";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}