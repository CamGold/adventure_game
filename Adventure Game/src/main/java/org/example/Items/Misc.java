package org.example.Items;

public class Misc implements Item{
    private String name = "";
    private final ItemType type = ItemType.Misc;
    int itemValue = 0;
    int x = 0;
    int y = 0;

    public Misc(int x, int y, String name, int value){
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
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void setItemValue(int value) {
        this.itemValue = value;
    }

    @Override
    public int getItemValue() {
        return this.itemValue;
    }

    @Override
    public String toString(){
        return this.name + ", Value: $"+this.itemValue;
    }
}