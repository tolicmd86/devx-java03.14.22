package com.java.class24;

import java.nio.charset.StandardCharsets;

public class FindLengthEachWordFromSentence {
    public static void main(String[] args) {
        //write a program to find length of each word

        String str="The Times of India is an Indian English language daily newspaper and digital news media owned and managed by The Times Group. It is the third largest newspaper in India by circulation and largest selling English language daily in the world.";
                String[]word=str.split(" ");

        for(int i=0;i<=word.length;i++) {
            System.out.println(word[i]+" = " +" length "+word[i].length());
        }

    }
}
