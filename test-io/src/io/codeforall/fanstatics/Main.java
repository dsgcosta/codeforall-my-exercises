package io.codeforall.fanstatics;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // open an input stream with a file path as the source
        FileInputStream inputStream = new FileInputStream("/Users/codecadet/Documents/test.rtf");

// read one byte from the file
        int b = inputStream.read();

// test for end of file
        if (b == -1) {
            // no more reading from this file...
        }

// read multiple bytes from the file
        byte[] buffer = new byte[1024];
        int num = inputStream.read(buffer);

// print the number of bytes read
        if (num != -1) {
            System.out.println("I have read this many bytes: " + num);
        }

// don't forget to close the input stream
        inputStream.close();
    }
}
