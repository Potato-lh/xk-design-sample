package com.xksquare.pattern.design.mediator.sample2;

import java.util.ArrayList;
import java.util.List;

public class MysqlDatabase extends Database {

  private List<String> datas = new ArrayList<>();

  public MysqlDatabase(DataMediator dataMediator) {
    super(dataMediator);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void add(String data) {
    System.out.println("mysql database add data >>>>" + data);
    datas.add(data);
  }

  @Override
  public void addSyn(String data) {
    // TODO Auto-generated method stub
    this.add(data);
    this.dataMediator().syn(DatabaseType.mysql, data);
  }

}
