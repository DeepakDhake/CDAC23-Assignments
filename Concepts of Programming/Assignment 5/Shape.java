
abstract class Shape {
    protected double x;
    protected double y;
    
    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public abstract double area();
    
    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }
}