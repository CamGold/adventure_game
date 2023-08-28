package org.example.Items;

public class Armor implements Item{
    private String name = "";
    private final ItemType type = ItemType.Armor;
    int itemValue = 0;
    int x = 0;
    int y = 0;

    public Armor(int x, int y, String name, int value){
        this.x = x;
        this.y = y;
        this.itemValue = value;
        this.name = name;
    }
    @Override
    public ItemType getType() {
        return this.type;
    }


    @Override
    public int getItemValue() {
        return this.itemValue;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        return this.name + ", Defense: " +this.itemValue;
    }
}
