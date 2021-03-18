package entities;

import entities.pipes.Pipe;
import entities.utils.Utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FaucetSystem {
    Map<Faucet, List<Faucet>> faucets = new HashMap<>();

    public void setFaucet(Faucet faucet, Faucet toFirst, Faucet toSecond) {
        faucets.put(faucet, Arrays.asList(toFirst, toSecond));
    }

    public void setUpFaucetSystemByString(String value) {
        String[] faucetsNames = value.split(";")[1].split(",");

        for (int i = 0; i < Utils.getListOfFaucets(value).size(); i++) {
            setFaucet(Utils.getFaucetByName(Utils.getFaucetNameFromString(faucetsNames[i]), Utils.getListOfFaucets(value)),
                    Utils.getFaucetByName(Utils.getFirstToFaucetNameFromString(faucetsNames[i]), Utils.getListOfFaucets(value)),
                    Utils.getFaucetByName(Utils.getSecondToFaucetNameFromString(faucetsNames[i]), Utils.getListOfFaucets(value)));
        }
    }

    public Map<Faucet, List<Faucet>> getFaucets() {
        return faucets;
    }


}
