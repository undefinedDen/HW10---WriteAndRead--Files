package app.controller;

import app.model.AppModel;

public class AppController {
    static String text;
    AppModel model = new AppModel();

    public void getOutput() {

        text = model.getValidInputText();
        String write = model.getWrite(text);
        System.out.println(write);
        System.out.println("File  content:");
        model.getReadFile();


    }
}
