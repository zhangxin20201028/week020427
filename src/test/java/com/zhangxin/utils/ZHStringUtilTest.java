package com.zhangxin.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZHStringUtilTest {

	@Test
	public void testGetZHString() {
		String string = ZHStringUtil.getZHString(10);
		System.out.println(string);
	}

	@Test
	public void testGetZHName() {
		String name = ZHStringUtil.getZHName();
		System.out.println(name);
	}

}
