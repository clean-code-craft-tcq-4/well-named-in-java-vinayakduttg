package com.tcq.colorcoder;

import com.tcq.colorcoder.model.MajorColor;
import com.tcq.colorcoder.model.MinorColor;
import com.tcq.colorcoder.service.ColorPairServices;

public class Main {

  public static void main(String[] args) {
    ColorPairServices.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
    ColorPairServices.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

    ColorPairServices.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
    ColorPairServices.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
  }
}
