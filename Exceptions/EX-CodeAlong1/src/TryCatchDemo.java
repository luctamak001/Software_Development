public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0; // Delibrate error
            int result = a / b;
            System.out.println("result = %s".formatted(result));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
