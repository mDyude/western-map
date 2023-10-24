/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.team29.westernmap;
//123
/**
 *
 * @author Administrator
 */
public class userHelp {
    private final String userGuide;

    public userHelp() {
        userGuide = "the 'floor' function allows you to switch floors you wish to see "
                + "the 'layers' allows you to see the different building facilities, "
                + "the 'rooms' allow you to search the room you are looking for, "
                + "for additional information, use the search funtion to find out what you need ";
    }

    public void displayUserGuide() {
        // Display the user guide in a dialog box or a new window
        // Here we just print it to the console for simplicity
        System.out.println(this.userGuide);
    }

    public void displayAboutScreen() {
        // Display the "About" screen in a dialog box or a new window
        // Here we just print it to the console for simplicity
        System.out.println("Building Floor Plans System");
        System.out.println("Version 1.0");
        System.out.println("Release date: 2023-03-17");
        System.out.println("Team members: Tristan, Hengrui. Huiliang, Adrian, Yuke");
        System.out.println("Contact us at: hyi28@uwo.ca");
    }
}