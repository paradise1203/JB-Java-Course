package com.kpfu.itis.ioc;

/**
 * Created by aleksandrpliskin on 11.11.16.
 */
public class ScheduleViewer {

  public void viewSchedule(ScheduleMaker maker) {
    System.out.println(maker.makeSchedule());
  }

}
