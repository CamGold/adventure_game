package org.example.Items;

public interface Item {



    ItemType getType();
    void setX(int x);
    void setY(int y);

    void setItemValue(int value);
    int getItemValue();
}
