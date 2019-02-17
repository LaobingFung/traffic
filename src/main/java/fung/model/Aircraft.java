package main.java.fung.model;

public class Aircraft extends Transportation {
    public Aircraft() {
        super.setPrice(1000.00);
    }

    @Override
    public boolean isAvaliable(double cost) {
        boolean availability = cost >= this.getPrice();
        if (availability == true) {
            System.out.println("可以坐飞机，飞机时刻表XXX");
        } else {
            System.out.println("不能坐飞机");
        }
        return availability;
    }
}
