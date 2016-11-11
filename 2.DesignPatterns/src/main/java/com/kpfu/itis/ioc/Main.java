package com.kpfu.itis.ioc;

/**
 * Created by aleksandrpliskin on 11.11.16.
 */
public class Main {
  public static void main(String[] args) {
    ScheduleViewer viewer = new ScheduleViewer();
    ScheduleMaker maker1 = new SchoolScheduleMaker();
    ScheduleMaker maker2 = new UniversityScheduleMaker();
    viewer.viewSchedule(maker1);
    viewer.viewSchedule(maker2);
  }
}
