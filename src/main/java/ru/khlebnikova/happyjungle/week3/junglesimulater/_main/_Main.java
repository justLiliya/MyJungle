package ru.khlebnikova.happyjungle.week3.junglesimulater._main;

import ru.khlebnikova.happyjungle.week3.junglesimulater.entity.Toucan;
import ru.khlebnikova.happyjungle.week3.junglesimulater.util.EventProducer;

public class _Main {

    public static void main(String[] args){
        Toucan toucan = new Toucan();
        EventProducer eventProducer = new EventProducer();
        eventProducer.startSimulation(toucan);
    }
}
