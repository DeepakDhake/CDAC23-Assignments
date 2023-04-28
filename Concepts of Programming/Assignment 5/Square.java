class Square extends Shape {
    private double side;
    
    public Square(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }
    
    @Override
    public double area() {
        return side * side;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", side=" + side;
    }
}