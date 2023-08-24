package org.example.Items;

import org.example.Player.ItemType;

public class Weapon implements Item{
    private final ItemType type = ItemType.Weapon;
    int itemValue = 0;
    int x = 0;
    int y = 0;

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
}
