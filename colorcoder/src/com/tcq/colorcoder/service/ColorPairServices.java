/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package com.tcq.colorcoder.service;

import com.tcq.colorcoder.model.ColorPair;
import com.tcq.colorcoder.model.MajorColor;
import com.tcq.colorcoder.model.MinorColor;


public class ColorPairServices {

  static ColorPair getColorFromPairNumber(int pairNumber) {
    int zeroBasedPairNumber = pairNumber - 1;
    MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / ColorConstants.numberOfMinorColors);
    MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % ColorConstants.numberOfMinorColors);
    return new ColorPair(majorColor, minorColor);
  }

  static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
    return major.getIndex() * ColorConstants.numberOfMinorColors + minor.getIndex() + 1;
  }

  public static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
    ColorPair colorPair = getColorFromPairNumber(pairNumber);
    System.out.println("Got pair " + colorPair.toString());
    if (colorPair.getMajor() != expectedMajor) {
      System.out.println("Mojor Color not matching");
    }
    if (colorPair.getMinor() != expectedMinor) {
      System.out.println("Minor Color not matching");
    }
  }

  public static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
    int pairNumber = getPairNumberFromColor(major, minor);
    System.out.println("Got pair number " + pairNumber);
    if (pairNumber != expectedPairNumber) {
      System.out.println("Pair not matching");
    }
  }

}
