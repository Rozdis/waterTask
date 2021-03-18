package entities;

public class Source extends Faucet{
    private Faucet to;
    private final Faucet from = null;

    public Source(Faucet to){
        this.to = to;
    }

    public Faucet getTo(){
        return to;
    }
}
