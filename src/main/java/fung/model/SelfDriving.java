package main.java.fung.model;

public class SelfDriving extends Transportation {
    public SelfDriving() {
        super.setPrice(500.00);
    }

    @Override
    public boolean isAvaliable(double cost) {
        boolean availability = cost >= this.getPrice();
        if (availability == true) {
            System.out.println("可以自驾，自驾细节XXX");
        } else {
            System.out.println("不能自驾");
        }
        return availability;
    }
}
