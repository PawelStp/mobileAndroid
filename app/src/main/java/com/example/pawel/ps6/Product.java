package com.example.pawel.ps6;

import java.util.List;

/**
 * Created by pawel on 03.11.2017.
 */

public class Product {
    private String _name;
    private String _type;
    private boolean _checked = false;

    public Product(String name, String type) {
        _name = name;
        _type = type;
    }

    public String getName() {
        return _name;
    }

    public String getType() {
        return _type;
    }

    public boolean isChecked() {
        return _checked;
    }

    public void setChecked(boolean value) { _checked = value; }

    static void initialize(List<Product> list) {
        list.add(new Product("Jabłko", "fruit"));
        list.add(new Product("Pomidor", "vegetable"));
        list.add(new Product("Ciastko", "sweets"));
        list.add(new Product("Ziemniak", "vegetable"));
        list.add(new Product("Truskawka", "fruit"));
        list.add(new Product("Baton", "sweets"));
    }
}
