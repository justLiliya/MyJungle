package ru.khlebnikova.happyjungle.week3.junglesimulater.util;

import ru.khlebnikova.happyjungle.week3.junglesimulater.entity.Toucan;

public class EventProducer {

    public void activateEvent(Toucan toucan) {
        while (checkStatus(toucan)) {
            int eventNumber = (int) (Math.random() * 100);
            if (eventNumber >= 0 && eventNumber < 10) {
                sleepEvent(toucan);
            } else if (eventNumber >= 10 && eventNumber < 20) {
                cleanEvent(toucan);
            } else if (eventNumber >= 30 && eventNumber < 40) {
                screamEvent(toucan);
            } else if (eventNumber >= 40 && eventNumber < 45) {
                playEvent(toucan);
            } else if (eventNumber >= 45 && eventNumber < 50) {
                flyEvent(toucan);
            } else if (eventNumber >= 50 && eventNumber < 60) {
                eatBerriesEvent(toucan);
            } else if (eventNumber >= 60 && eventNumber < 70) {
                eatBananaEvent(toucan);
            } else if (eventNumber >= 70 && eventNumber < 80) {
                hatchingEvent(toucan);
            } else if (eventNumber >= 80 && eventNumber < 90) {
                feedingEvent(toucan);
            } else if (eventNumber >= 90 && eventNumber < 100) {
                hitBirdcatcher(toucan);
            }
        }
        System.out.println("Птищщка умерла!");
    }

    private void sleepEvent(Toucan toucan) {
        int energy = toucan.getEnergy();
        energy = energy + 20;
        energy = isEnergyOver100rLessZero(energy);
        toucan.setEnergy(energy);
        System.out.println("Toucan sleeped! Current energy: " + toucan.getEnergy());

    }

    private void screamEvent(Toucan toucan) {
        int energy = toucan.getEnergy();
        int health = toucan.getHealth();
        energy = energy - 5;
        health = (health - 1) + (int) (toucan.getRateOfbeak());
        energy = isEnergyOver100rLessZero(energy);
        toucan.setEnergy(energy);
        System.out.println("Toucan screamed piu-piu-piu! Current energy: " + toucan.getEnergy() + " Current health " + toucan.getHealth());

    }

    private void playEvent(Toucan toucan) {
        int energy = toucan.getEnergy();
        int health = toucan.getHealth();
        energy = energy - 18;
        health = (health + 8) + (int) (toucan.getRateOfbeak());
        energy = isEnergyOver100rLessZero(energy);
        toucan.setEnergy(energy);
        System.out.println("Toucan playing with a friend! Current energy: " + toucan.getEnergy() + " Current health " + toucan.getHealth());
    }

    private void hatchingEvent(Toucan toucan) {
        int energy = toucan.getEnergy();
        int health = toucan.getHealth();
        energy = energy - 10;
        health = health - 3;
        energy = isEnergyOver100rLessZero(energy);
        toucan.setEnergy(energy);
        System.out.println("Toucan hatching eggs! Current energy: " + toucan.getEnergy() + " Current health " + toucan.getHealth());
    }

    private void feedingEvent(Toucan toucan) {
        int energy = toucan.getEnergy();
        int health = toucan.getHealth();
        energy = energy - 10;
        health = health - 2;
        energy = isEnergyOver100rLessZero(energy);
        toucan.setEnergy(energy);
        System.out.println("Toucan feeding chicks! Current energy: " + toucan.getEnergy() + " Current health " + toucan.getHealth());
    }

    public void flyEvent(Toucan toucan) {
        int energy = toucan.getEnergy();
        energy = energy - 7;
        energy = isEnergyOver100rLessZero(energy);
        toucan.setEnergy(energy);
        System.out.println("Toucan flew! Current energy: " + toucan.getEnergy());

    }

    public void cleanEvent(Toucan toucan) {
        int health = toucan.getHealth();
        health = health + 17;
        health = isEnergyOver100rLessZero(health);
        toucan.setEnergy(health);
        System.out.println("Toucan cleans feathers! Current health: " + toucan.getHealth());

    }

    public void eatBerriesEvent(Toucan toucan) {
        int energy = toucan.getEnergy();
        int health = toucan.getHealth();
        energy = (energy - 7) * (int) (toucan.getRateOfbeak());
        health = health + 10;
        energy = isEnergyOver100rLessZero(energy);
        health = isHealthOver100rLessZero(health);
        toucan.setEnergy(energy);
        toucan.setHealth(health);
        System.out.println("Toucan eat berrries! Current energy: " + toucan.getEnergy() + " Current health " + toucan.getHealth());

    }

    public void eatBananaEvent(Toucan toucan) {
        int energy = toucan.getEnergy();
        int health = toucan.getHealth();
        energy = energy - 10;
        health = health + 15;
        energy = isEnergyOver100rLessZero(energy);
        health = isHealthOver100rLessZero(health);
        toucan.setEnergy(energy);
        toucan.setHealth(health);
        System.out.println("Toucan eat banana! Current energy: " + toucan.getEnergy() + " Current health " + toucan.getHealth());

    }

    public void hitBirdcatcher(Toucan toucan) {
        int health = toucan.getHealth();
        health = health - 15;
        health = isHealthOver100rLessZero(health);
        toucan.setHealth(health);
        System.out.println("Birdcatcher caught a toucan! Current energy: " + toucan.getEnergy() + " Current health " + toucan.getHealth());

    }

    public int isEnergyOver100rLessZero(int energy) {
        if (energy > 100) {
            energy = 100;
        } else if (energy < 0) {
            energy = 0;
        }
        return energy;
    }

    public int isHealthOver100rLessZero(int health) {
        if (health > 100) {
            health = 100;
        } else if (health < 0) {
            health = 0;
        }
        return health;
    }

    private boolean checkStatus(Toucan toucan) {
        if (toucan.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private void checkEnergy(Toucan toucan) {
        if (toucan.getEnergy() <= 0) {
            int health = toucan.getHealth();
            health = health - 1;
            if (health < 0) {
                health = 0;
            }
            toucan.setHealth(health);
        }
    }
}
