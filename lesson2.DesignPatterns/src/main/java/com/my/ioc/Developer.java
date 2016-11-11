package com.my.ioc;

/**
 * Created by aleksandrpliskin on 09.11.16.
 */
public class Developer implements Worker {

  protected Project project;

  public Developer(Project project) {
    this.project = project;
  }

  @Override
  public void showResults() {
    project.perform();
  }
}
