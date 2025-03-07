package app.view;

import java.util.Scanner;

public class AppView {

    public <T>void getDisplayInfo(T output){
        System.out.print(output);
    }
    public String getInputText(){
        Scanner scanner = new Scanner(System.in);
        getDisplayInfo("Input text and i will write it at file: ");
        return scanner.nextLine();
    }
}
