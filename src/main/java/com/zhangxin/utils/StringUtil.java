package com.zhangxin.utils;

import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @ClassName: StringUtil
 * @Description: 字符串处理工具类
 * @author: charles
 * @date: 2020年4月23日 上午10:40:06
 */
public class StringUtil {
	
	
	/*
	* 方法功能：根据正则在字符串提取一段值，用于后面在url地址里提取ID值。
	* 例如在“http://news.cnstock.com/news,yw-201908-4413224.htm”把“4413224”提取出来。
	* 
	* regex = [0-9]+(?=[^0-9]*$)
	*/
	public static String getPlaceholderValue(String src, String regex){
		
		  Pattern p = Pattern.compile(regex);//编译规则
		  Matcher matcher = p.matcher(src);//Pattern 匹配src
		  if(matcher.find()) {//如果找到
			return  matcher.group();//返回匹配到的字符串
		  }
		return null;
	}
	
	

	// 判断一个字符串是否是数字 考虑整数 负数 小数

	public static boolean isNumber(String src) {

		String reg = "^(-)?[0-9]+(\\.[0-9]+)?$";
		return src.matches(reg);
	}

	// 判断是否是中国的手机号
	public static boolean isPhone(String src) {
		// 定义规则
		String reg = "^1[3|4|5|7|8]\\d{9}$";
		return src.matches(reg);

	}

	// 判断是否邮箱
	public static boolean isEMail(String src) {
		// 定义规则 num2222@126.com
		String reg = "\\w+\\@\\w+\\.\\w+";
		return src.matches(reg);
	}

	// 方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static boolean hasLength(String src) {

		return null != src && src.length() > 0;
	}

	// 方法2：判断源字符串 空格也算没值 (5分)
	public static boolean hasText(String src) {

		return null != src && src.trim().length() > 0;
	}

	// 方法3-1：返回参数1个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内，例如“中”(5分)
	// 参考https://blog.csdn.net/halchan/article/details/78353947
	public static String randomChineseString() {

		String str = null;
		int highPos, lowPos;
		Random random = new Random();
		highPos = (176 + random.nextInt(40));// 区码，0xA0打头，从第16区开始，即0xB0=11*16=176,16~55一级汉字，56~87二级汉字
		random = new Random();
		lowPos = 161 + random.nextInt(94);// 位码，0xA0打头，范围第1~94列
		byte[] bArr = new byte[2];

		bArr[0] = (new Integer(highPos)).byteValue();
		bArr[1] = (new Integer(lowPos)).byteValue();
		try {
			str = new String(bArr, "GB2312"); // 区位码组合成汉字
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;

	}
	
	

	
}


