package entities.pipes;

import entities.Faucet;

public class InPipe {
    private Faucet inPoint = null;

    //counter of incoming pipes
    private static int counterOfInPipes = 0;

    public InPipe(){
        counterOfInPipes++;
    }

    public int getCounterOfInPipes(){
        return counterOfInPipes;
    }

    public Faucet getInPoint() {
        return inPoint;
    }

    public void setInPoint(Faucet inPoint) {
        this.inPoint = inPoint;
    }
}
