/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package com.tcq.colorcoder.model;

import com.tcq.colorcoder.service.ColorConstants;


public class ColorPair {

  private MajorColor majorColor;
  private MinorColor minorColor;

  public ColorPair(MajorColor major, MinorColor minor) {
    majorColor = major;
    minorColor = minor;
  }

  public MajorColor getMajor() {
    return majorColor;
  }

  public MinorColor getMinor() {
    return minorColor;
  }

  @Override
  public String toString() {
    String colorPairStr = ColorConstants.majorColorNames[majorColor.getIndex()];
    colorPairStr += " ";
    colorPairStr += ColorConstants.minorColorNames[minorColor.getIndex()];
    return colorPairStr;
  }
}