package entities.pipes;

import entities.Faucet;

public class OutPipe {
    private Faucet fromPoint = null;
    //counter of outgoing pipes
    private static int counterOfOutPipes = 0;

    public OutPipe(){
        counterOfOutPipes++;
    }

    public int getCounterOfOutPipes(){
        return counterOfOutPipes;
    }

    public Faucet getFromPoint() {
        return fromPoint;
    }

    public void setFromPoint(Faucet fromPoint) {
        this.fromPoint = fromPoint;
    }
}
