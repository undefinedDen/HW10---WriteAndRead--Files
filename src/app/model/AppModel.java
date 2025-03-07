package app.model;

import app.util.Constants;
import app.validation.AppValidation;
import app.view.AppView;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class AppModel {
    static String fileName = Constants.BASE_FILE_PATH + Constants.FILE_NAME;
    static byte[] array;
    AppView view = new AppView();
    AppValidation validate = new AppValidation();

    public String getValidInputText() {
        String input = "";
        boolean isInputValid = false;
        while (!isInputValid) {
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

    public String getWrite(String text) {


        boolean isFileWrite = false;
        while (!isFileWrite) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileName);
                array = text.getBytes();
                fileOutputStream.write(array, 0, array.length);
            } catch (IOException e) {
                view.getDisplayInfo("Result: " + e.getMessage());
                continue;
            }
            isFileWrite = true;
        }
        return "Result: Successes!!";

    }

    public void getReadFile() {

        try {
            FileReader fileOutputStream = new FileReader(fileName);
            int i;
            while ((i = fileOutputStream.read()) != -1) {
                view.getDisplayInfo((char) i);
            }
        } catch (IOException e) {
            view.getDisplayInfo(e.getMessage());
        }

    }

}
