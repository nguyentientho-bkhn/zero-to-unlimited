package nguyentientho.core.constructor_;

import java.util.ArrayList;
import java.util.List;

public class mainFruits {
    public static void main(String[] args) {
        List<String> fl = new ArrayList<>();
        fl.add("Mango");
        fl.add("Orange");

        Fruits fr = new Fruits(fl);

        System.out.println(fr.getFruitsList());

        Fruits frCopy = fr;
        frCopy.getFruitsList().

                add("Apple");

        System.out.println(fr.getFruitsList());

        frCopy =new Fruits(fr);
        frCopy.getFruitsList().add("Banana");
        System.out.println(fr.getFruitsList());
        System.out.println(frCopy.getFruitsList());
    }

}
