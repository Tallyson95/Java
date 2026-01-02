package entities;

import entities.enums.Color;

public abstract class Forma {
    private Color color;

    public Forma(){}

    public Forma(Color color){
        this.color = color;
    }

    public Color getCor() {
        return color;
    }

    public void setCor(Color cor) {
        this.color = cor;
    }

    public abstract Double area();
}
