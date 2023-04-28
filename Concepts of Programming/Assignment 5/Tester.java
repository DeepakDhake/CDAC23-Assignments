
class Tester {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Shape shape = ShapeFactory.generateShape();
            System.out.println("Shape: " + shape.toString());
            System.out.println("Area: " + shape.area());
            System.out.println();
        }
    }
}

