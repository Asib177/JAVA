// package com.mycompany.autotyper;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

public class AutoTyper {

    public static void main(String[] args) throws AWTException, IOException {
        String str = "Hello World!";
    
        Robot rb = new Robot();
    
        Runtime rt = Runtime.getRuntime();
        rt.exec("https://www.facebook.com/");
    

    }
}