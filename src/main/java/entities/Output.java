package entities;

public class Output extends Faucet{
    private Faucet from;
    private final Faucet to = null;

    public Output(Faucet from) {
        this.from = from;
    }

    public Faucet getFrom() {
        return from;
    }
}
