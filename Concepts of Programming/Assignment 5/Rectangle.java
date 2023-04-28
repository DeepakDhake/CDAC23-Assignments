class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double area() {
        return width * height;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", width=" + width + ", height=" + height;
    }
}