package com.olair.calculator.data;

/**
 * 操作符或者数字，有一个次要元素用于显示在右上角
 * Create by oLair on 2020/1/11.
 */
public class Element {

    /**
     * 主要元素
     */
    private String mainElement;

    /**
     * 主要元素描述
     */
    private String mainDesc;

    /**
     * 次要元素
     */
    private String minorElement;

    /**
     * 次要标志的描述信息
     */
    private String minorDesc;

    /**
     * 是否是加紧乘除操作符
     */
    private boolean isOperator;

    public Element(String mainElement, String mainDesc, String minorElement, String minorDesc, boolean isOperator) {
        this.mainElement = mainElement;
        this.mainDesc = mainDesc;
        this.minorElement = minorElement;
        this.minorDesc = minorDesc;
        this.isOperator = isOperator;
    }

    public String getMainElement() {
        return mainElement;
    }

    public String getMainDesc() {
        return mainDesc;
    }

    public String getMinorElement() {
        return minorElement;
    }

    public String getMinorDesc() {
        return minorDesc;
    }

    public boolean isOperator() {
        return isOperator;
    }
}
