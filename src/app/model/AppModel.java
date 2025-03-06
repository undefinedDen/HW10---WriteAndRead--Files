package app.model;

import app.validation.AppValidation;
import app.view.AppView;

public class AppModel {
    AppView view = new AppView();
    AppValidation validate = new AppValidation();
    public String getValidInputText(String input ){
        boolean isInputValid = false;
        while(!isInputValid) {
            try {
                 input = view.getInputText();
                validate.validateInputText(input);
            } catch (NullPointerException e) {
                view.getDisplayInfo(e.getMessage());
                continue;
            }
            isInputValid = true;
        }
        return input;
    }
}
