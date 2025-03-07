package app.validation;

import app.exception.AppException;

public class AppValidation {
    public void validateInputText(String input) throws RuntimeException {
        if (input.trim().isEmpty()) {
            throw new AppException("The line is empty!");
        }
    }
}
