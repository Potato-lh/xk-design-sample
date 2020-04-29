package com.xksquare.pattern.design.mediator.sample2;

import java.util.ArrayList;
import java.util.List;

public class EsDatabse extends Database {

  private List<String> datas = new ArrayList<>();

  public EsDatabse(DataMediator dataMediator) {
    super(dataMediator);
  }

  @Override
  public void add(String data) {
    System.out.println("es database add data >>>>" + data);
    datas.add(data);
  }

  @Override
  public void addSyn(String data) {
    // TODO Auto-generated method stub
    this.add(data);
    this.dataMediator().syn(DatabaseType.es, data);
  }

}
