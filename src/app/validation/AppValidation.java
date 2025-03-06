package app.validation;

public class AppValidation {
    public void validateInputText(String input) throws RuntimeException {
        if (input.trim().isEmpty()) {
            throw new NullPointerException("The line is empty!");
        }
    }
}
