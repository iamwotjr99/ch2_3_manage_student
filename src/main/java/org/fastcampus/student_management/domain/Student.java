package org.fastcampus.student_management.domain;

public class Student {

  private final String name;
  private final int age;
  private final String address;
  private boolean activated;

  public Student(String name, int age, String address) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("이름은 필수 입력값입니다.");
    }

    this.name = name;
    this.age = age;
    this.address = address;
    this.activated = true;
  }

  public Student(Student student, boolean activated) {
    this.name = student.name;
    this.age = student.age;
    this.address = student.address;

    this.activated = activated;
  }

  public void activated() {
    if(this.activated) {
      throw new IllegalArgumentException();
    }

    this.activated = true;
  }

  public void deActivated() {
    if(!this.activated) {
      throw new IllegalArgumentException();
    }

    this.activated = false;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }
  public boolean isActivate() {
    return activated;
  }
}
