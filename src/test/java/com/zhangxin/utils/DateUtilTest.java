package com.zhangxin.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetAgeByBirthday() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInitMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEndMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testRandom() {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2012, 1, 1);
		DateUtil.random(calendar.getTime(), new Date());
	}

}
