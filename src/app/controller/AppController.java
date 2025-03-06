package app.controller;

import app.model.AppModel;
import app.view.AppView;

public class AppController {
    static  String text;
    AppModel model = new AppModel();
    AppView view = new AppView();
    public void getOutput(){

String f = model.getValidInputText(text);
        view.getDisplayInfo(f);
    }
}
