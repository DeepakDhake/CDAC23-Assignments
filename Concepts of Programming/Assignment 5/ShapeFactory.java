import java.util.Random;

class ShapeFactory {
    private static final Random random = new Random();
    
    public static Shape generateShape() {
        double x = random.nextDouble() * 100;
        double y = random.nextDouble() * 100;
        double sideOrWidth = random.nextDouble() * 10 + 1;
        double height = random.nextDouble() * 10 + 1;
        double radius = random.nextDouble() * 5 + 1;
        int shapeType = random.nextInt(3);
        
        switch (shapeType) {
            case 0:
                return new Circle(x, y, radius);
            case 1:
                return new Rectangle(x, y, sideOrWidth, height);
            case 2:
                return new Square(x, y, sideOrWidth);
            default:
                throw new RuntimeException("Invalid shape type");
        }
    }
}
