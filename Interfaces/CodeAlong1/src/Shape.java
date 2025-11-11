public interface Shape {

     double getArea();

     double getPerimeter();

     String getName();

     default double getAspectRatio() {
         // For shapes that can't define on AR use 1.0 by default.
         return 1.0;
     }

     static double sumAreas(Shape[] shapes){
         double sum = 0;
         for(Shape s: shapes){
             sum += s.getArea();
         }
         return sum;
     }

}
