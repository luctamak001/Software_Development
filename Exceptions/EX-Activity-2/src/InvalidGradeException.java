// TODO: Step 1 - This class represents a custom checked exception for invalid grades.
//  Make sure you understand that extending Exception makes this a *checked* exception.
//  That means any method that might throw it must either handle it in a try/catch
//  block or declare it with "throws InvalidGradeException".
public class InvalidGradeException extends Exception {

    // TODO: Add a no-argument constructor.
    //  - Inside it, call the superclass (Exception) constructor using super(...).
    //  - Provide a clear default message explaining what “invalid grade” means
    //    (for example, something about the valid range 0–100).
    //
    // Hint: This constructor should not take any parameters, but it should give
    //       a reasonable default explanation to whoever catches this exception.

    // TODO: Add a constructor that takes a String message parameter.
    //  - This constructor should accept a custom error message.
    //  - Inside it, pass that message on to the superclass constructor using super(message).
    //
    // Hint: This allows other parts of your code to specify more detailed messages
    //       depending on how the grade failed validation.
}
