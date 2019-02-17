package main.java.fung.model;

public class Rail extends Transportation {
    public Rail() {
        super.setPrice(400.00);
    }

    @Override
    public boolean isAvaliable(double cost) {
        boolean availability = cost >= this.getPrice();
        if (availability == true) {
            System.out.println("可以坐火车，火车时刻表XXX");
        } else {
            System.out.println("不能坐火车");
        }
        return availability;
    }
}
