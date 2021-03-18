package entities;

import entities.pipes.InPipe;
import entities.pipes.OutPipe;

public class Faucet {
    /*
    Faucet has three states of the incoming stream of water:
            - with one pipe
            - with two pipes
            - without pipes
    Also has three states of the outgoing stream of water:
            - one pipe
            - two pipes
            - no pipes
     */
    private final InPipe firstInPipe = null;
    private final InPipe secondInPipe = null;
    private final OutPipe firstOutPipe = null;
    private final OutPipe secondOutPipe = null;
    private String name = null;

    public Faucet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
