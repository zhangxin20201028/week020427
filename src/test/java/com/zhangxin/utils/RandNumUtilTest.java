package com.zhangxin.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandNumUtilTest {

	@Test
	public void testGetValue() {
		double value = RandNumUtil.getValue(30, 22, 95);
		System.out.println(value);
	}

	@Test
	public void testRandom() {
		int i = RandNumUtil.random(1, 3);
		System.out.println(i);
	}

}
