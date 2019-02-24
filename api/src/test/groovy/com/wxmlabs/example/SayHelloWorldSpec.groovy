package com.wxmlabs.example

import spock.lang.Specification

class SayHelloWorldSpec extends Specification {
  def "hello world with spock!"() {
    given:
    def hello = new SayHelloWorld()

    expect:
    hello.say() == "hello, world"
  }
}
