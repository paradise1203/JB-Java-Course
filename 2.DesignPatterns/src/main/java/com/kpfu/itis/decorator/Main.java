package com.kpfu.itis.decorator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
  public static void main(String[] args) throws IOException {
    File file = new File("2.DesignPatterns/src/main/resources/file.txt");
    InputStream is = new FileInputStream(file);
    int c;
    while ((c = is.read()) != -1) {
      System.out.print((char) c);
    }
    System.out.println("");
  }
}
