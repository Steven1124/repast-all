package com.aaa.lee.repast.staticstatus;

/**
 * @author: dawang
 * @date: Created in 2020/3/13 13:36
 * @version: 1.0
 *  在JVM编译的java文件的时候--->class--->JVM会自动给所有的类以及通过类所生成出来的对象都添加上final关键字
 */
public class StatiCode {
    public static final String ENCODING = "UTF-8";
    public static final String PROVINCE = "province";
    public static final String COUNTRY = "country";
    public static final String CITY = "city";
    public static final String FORMAT_DATE = "yyyy-MM-dd hh:mm:ss";
    // TODO 这里的ip是测试数据，上线的时候注意替换
    public static final String TEST_IP = "222.137.210.39";
}
