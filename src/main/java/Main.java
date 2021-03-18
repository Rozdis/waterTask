import entities.FaucetSystem;
import entities.utils.Utils;

public class Main {
    public static void main(String[] args) {
        FaucetSystem faucetSystem = new FaucetSystem();
        faucetSystem.setUpFaucetSystemByString("A1-c1, A2-C2, A3-C3;" +
                "c1[c3 c4],c2[c3 c4],c3[c1 B1],c4[B2 B3]");

        System.out.println(faucetSystem.getFaucets());
    }
}
