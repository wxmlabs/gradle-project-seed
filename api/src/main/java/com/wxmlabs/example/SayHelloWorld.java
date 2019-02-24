package com.wxmlabs.example;

public class SayHelloWorld implements Speakable {
  @Override
  public String say() {
    return "hello, world";
  }
}
