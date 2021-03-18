package entities.utils;

import entities.Faucet;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Faucet> getListOfFaucets(String value){
        String[] faucets = value.split(";")[1].split(",");
        List<Faucet> faucetList = new ArrayList<>(faucets.length);

        for (String faucet:
             faucets) {
            faucetList.add(new Faucet(getFaucetNameFromString(faucet)));
        }

        return faucetList;
    }

    public static String getFaucetNameFromString(String value){
        return value.substring(0, 2);
    }

    public static String getFirstToFaucetNameFromString(String value){
        return value.substring(3, 5);
    }

    public static String getSecondToFaucetNameFromString(String value){
        return value.substring(6, 8);
    }

    public static Faucet getFaucetByName(String name, List<Faucet> faucets){
        for (Faucet faucet :
                faucets) {
            if (faucet.getName().equals(name))
                return faucet;
        }
        return null;
    }
}
