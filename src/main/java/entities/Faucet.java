package entities;

import entities.pipes.InPipe;
import entities.pipes.OutPipe;

public class Faucet {

    private String name = null;

    public Faucet(String name){
        this.name = name;
    }

    public Faucet(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
