package com.company;

public class GoodStuff implements Comparable <GoodStuff> {
    private String product;
    private Double cost;

    public GoodStuff(String product, double cost) {
        this.product = product;
        this.cost = cost;
    }

    @Override
    public int compareTo(GoodStuff stuff) {
        int result = this.product.compareTo(stuff.product);

        if (result == 0) {
            result = this.cost.compareTo(stuff.cost);
        }
        return result;
    }
}
