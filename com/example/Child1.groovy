package com.example
import groovy.transform.CompileStatic
@CompileStatic
class Child1 implements I1 {
  @Override
  final String method1() {
    'method1'
  }
}
