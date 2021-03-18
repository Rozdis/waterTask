package entities.pipes;

import entities.Faucet;

abstract public class Pipe {
    public abstract void setFrom(Faucet faucet);

    public abstract void setTo(Faucet faucet);
}
