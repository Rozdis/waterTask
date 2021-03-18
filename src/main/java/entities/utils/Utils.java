package entities.utils;

import entities.Faucet;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    private static List<Faucet> faucetList;

    public static String getString(String value){
        String inPipes = value.split(";")[0];
        String[] faucets = value.split(";")[1].split(",");
        faucetList = new ArrayList<>(faucets.length);
        for (String faucet:
             faucets) {
         //   System.out.println(faucet.substring(0, 2));
            faucetList.add(new Faucet(faucet.substring(0, 2)));
        }
        
        return value.split(";")[1];
    }

    public static List<Faucet> getFaucetList() {
        return faucetList;
    }

}
