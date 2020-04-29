package com.xksquare.pattern.design.mediator.sample2;

public class Client {

  public static void main(String[] args) {

    DataMediator mediator = new DatabseMediator();

    mediator.addSyn(DatabaseType.es, "user ==>>>marker.li");

  }


}
