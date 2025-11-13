// TODO: This class should represent a custom exception related to username validation.
//  Confirm that it extends Exception so it behaves as a checked exception.
//  That means code that might throw this must either catch it or declare it with "throws".
public class InvalidUsernameException extends Exception {

    // TODO: Define constructors for this exception, similar to your other custom exception classes.
    //  - Create a no-argument constructor that supplies a default username-related error
    //    message to the Exception superclass using super(...).
    //  - Create at least one constructor that accepts a String message and forwards it
    //    to the superclass constructor with super(message).
    //
    // Hint: Look back at how you designed InvalidGradeException and follow the same pattern,
    //       but adjust the wording of the messages so they make sense for usernames.
}
