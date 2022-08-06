package nguyentientho.core.constructor_;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    private List<String> fruitsList;

    public Fruits(List<String> fruitsList) {
        this.fruitsList = fruitsList;
    }

    public Fruits(Fruits fruits) {
        this.fruitsList = new ArrayList<>(fruits.getFruitsList());
    }

    public List<String> getFruitsList() {
        return fruitsList;
    }

    public void setFruitsList(List<String> fruitsList) {
        this.fruitsList = fruitsList;
    }
}
