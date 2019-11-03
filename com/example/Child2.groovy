package com.example
import groovy.transform.CompileStatic
@CompileStatic
class Child2 extends Child1 implements I2 {
  @Override
  final String method2() {
    'method2'
  }
}
