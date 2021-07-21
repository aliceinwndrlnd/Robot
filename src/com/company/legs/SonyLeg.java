package com.company.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Шаг вперед Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
