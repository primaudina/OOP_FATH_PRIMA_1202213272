public class calculation implements Runnable {
    double radius,side,area;
    double phi = 3.14;

    public void setSquare(double side) throws IllegalArgumentException {
        if (side <1) {
            throw new IllegalArgumentException("Illegal Exception");

        }
        this.side = side;
        this.area = side *side;
    }
    public double getSquare(); {
        return this.area;    
    }
    public void setCircle(double radius) throws IllegalArgumentException {
        if (radius <1) {
            throw new IllegalArgumentException("Illegal Exception");
        }  
        this.radius = radius;
        this.area = phi*radius*radius;

    }

     

    
}
