package org.unclediga;

import org.unclediga.words.*;

public class Talker{
  public static void main(String args[]){
     IGreeting w = new Hello();
     w.sayGreeting();
     new Hey().sayGreeting();     
     new GoodDay().sayGreeting();
  }
}

