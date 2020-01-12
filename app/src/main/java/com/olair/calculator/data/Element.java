package com.olair.calculator.data;

/**
 * 操作符或者数字，有一个次要元素用于显示在右上角
 * Create by oLair on 2020/1/11.
 */
public class Element {

    /**
     * 主要元素
     */
    private char mainElement;

    /**
     * 主要元素描述
     */
    private String mainDesc;

    /**
     * 次要元素
     */
    private char minorElement;

    /**
     * 次要标志的描述信息
     */
    private String minorDesc;

    /**
     * 是否是加紧乘除操作符
     */
    private boolean isOperator;


}
