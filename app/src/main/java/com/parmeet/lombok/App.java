/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.parmeet.lombok;

import java.io.IOException;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(new App().getGreeting());
    }
}
