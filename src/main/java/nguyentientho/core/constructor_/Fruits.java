package nguyentientho.core.constructor_;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    private List<String> FruitsList;

    public Fruits(List<String> fruitsList) {
        FruitsList = fruitsList;
    }

    public Fruits(Fruits fruits) {
        List<String> fl = new ArrayList<>();
        for (String e : fruits.getFruitsList()) {
            fl.add(e);
        }
        this.FruitsList = fl;
    }

    public List<String> getFruitsList() {
        return FruitsList;
    }

    public void setFruitsList(List<String> fruitsList) {
        FruitsList = fruitsList;
    }
}
