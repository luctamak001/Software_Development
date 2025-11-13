public class UsernameValidator {

public static void validateUsername(String username) throws InvalidUsernameException {
        if (username.length() < 3) {
            throw new InvalidUsernameException("Username too short: " + username);
        }

        if (username.contains(" ")) {
            throw new InvalidUsernameException("Username cannot contain spaces: " + username);
        }

        System.out.println("Username '" + username + "' is valid.");
    }

    public static void main(String[] args) {
        String[] usernames = {
                "ab",
                "validUser",
                "my user",
                "okName"
        };

        try {
            for (String username : usernames) {
                validateUsername(username);
            }
        } catch (InvalidUsernameException e) {
            System.out.println("Validation error: " + e.getMessage());
        } finally {
            System.out.println("Username validation finished.");
        }
    }
}
