package com.my.ioc;

/**
 * Created by aleksandrpliskin on 09.11.16.
 */
public class Company {
  public static void main(String[] args) {
    Worker developer = new Developer(new ComputerGame());
    developer.showResults();
  }
}
