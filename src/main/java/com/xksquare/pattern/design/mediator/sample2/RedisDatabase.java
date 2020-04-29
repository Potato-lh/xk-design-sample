package com.xksquare.pattern.design.mediator.sample2;

import java.util.ArrayList;
import java.util.List;

public class RedisDatabase extends Database {

  private List<String> datas = new ArrayList<>();

  public RedisDatabase(DataMediator dataMediator) {
    super(dataMediator);
  }

  @Override
  public void add(String data) {
    System.out.println("redis database add data >>>>" + data);
    datas.add(data);
  }

  @Override
  public void addSyn(String data) {
    // TODO Auto-generated method stub
    this.add(data);
    this.dataMediator().syn(DatabaseType.redis, data);
  }

}
