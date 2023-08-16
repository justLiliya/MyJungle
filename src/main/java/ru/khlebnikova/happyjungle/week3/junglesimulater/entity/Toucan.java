package ru.khlebnikova.happyjungle.week3.junglesimulater.entity;

public class Toucan {

    //100 hp
    //коэффициент клюва (сколько энергии получает когда поест ягод)
    // 100 энергии - когда летает она тратится, когда 0 - умирает, тратится здоровье пока не поспит(после сна восстанавливается)
    //если за ним гонятся охотники, то каждый раз на каждом взмахе крыльев тратится здоровье и всё он умер

    private int health = 100;
    private int energy = 100;
    private final double rateOfbeak = 2.5;

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public double getRateOfbeak() {
        return this.rateOfbeak;
    }
}
