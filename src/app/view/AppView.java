package app.view;

import java.util.Scanner;

public class AppView {
    public void getDisplayInfo(String output){
        System.out.println(output);
    }
    public String getInputText(){
        Scanner scanner = new Scanner(System.in);
        getDisplayInfo("Input text and i will write it at file: ");
        return scanner.nextLine();
    }
}
