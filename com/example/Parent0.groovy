package com.example
import groovy.transform.CompileStatic
@CompileStatic
// If this class is named Parent2 then compilation is successful
abstract class Parent0<C extends Child2> extends Parent1<C> {
  @Delegate(includeTypes = [I2])
  @Override
  abstract C getChild()
}
