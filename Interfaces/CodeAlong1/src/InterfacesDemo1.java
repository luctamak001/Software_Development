public class InterfacesDemo1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3,2);

        for (Shape s : shapes) {
            System.out.print(s);
        }

        double totalShapeArea = Shape.sumAreas(shapes);
        System.out.println("Total area of shapes: " + totalShapeArea);
    }
}

