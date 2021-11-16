package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myText = "Programming is amazing! No Seriously.";
        System.out.println(myText.length()); //prints length of string
        System.out.println(myText.charAt(0));  //prints first character
        System.out.println(myText.substring(0,7)); //prints string from character 0 to 7
        System.out.println(myText.replace("ing is", "ers are")); //replaces characters with other ones
        int a = 'A';
        System.out.println(a); //prints out the numerical ASCII value of A
        char b = 66;
        System.out.println(b);//prints out the character with an ASCII value of 66
    }
}
