package com.xksquare.pattern.design.mediaer.sample1.strategy;

import com.xksquare.pattern.design.mediaer.sample1.RecommandDivided;

public interface AmountUsageStrategy {

  public boolean supportDivided(String dividedCode);


  public long cardinalAmount(RecommandDivided recommandDivided);

}
