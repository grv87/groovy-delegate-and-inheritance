package com.example
import groovy.transform.CompileStatic
@CompileStatic
abstract class Parent1<C extends Child1> {
  @Delegate(includeTypes = [I1])
  abstract C getChild()
}
