package rluispdev.main;

public class Buy {

    private String description;
    private double value;

    public Buy(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  "Compra: descrição = " + description +
                "valor = " + value;
    }
}
