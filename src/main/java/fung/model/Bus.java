package main.java.fung.model;

public class Bus extends Transportation {
    public Bus() {
        super.setPrice(300.00);
    }

    @Override
    public boolean isAvaliable(double cost) {
        boolean availability = cost >= this.getPrice();
        if (availability == true) {
            System.out.println("可以坐大巴车，大巴时刻表XXX");
        } else {
            System.out.println("不能坐大巴车");
        }
        return availability;
    }
}
