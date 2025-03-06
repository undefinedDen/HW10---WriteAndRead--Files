package app.util;

import app.controller.AppController;

public class AppStarter {
    public static void startApp(){
        new AppController().getOutput();
    }
}
