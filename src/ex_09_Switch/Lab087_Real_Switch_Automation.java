package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    // Web Automation
    // I will ask the user to give me the input from browser which he wants to
    // use to I will start the automation in that browser
    public static void main(String[] args) {
        // String browser  = args[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter browser");

        String browser = scanner.next();
        browser= browser.toLowerCase(); // lower(Chrome, CHROME, CHrome) == chrome
        switch (browser){
            case "chrome":
                System.out.println("starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
// Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("I have know idea which broswer is");
                        break;

        }
        }
    }

