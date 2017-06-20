package com.fanshe.test;

import java.io.StringWriter;
import java.util.LinkedList;


public class Test {
	private static final LinkedList<String> tranInfoList = new LinkedList<String>();
	
	public static void main(String[] args) {
		
		tranInfoList.add("1");
		tranInfoList.add("2");
		tranInfoList.add("3");
		
		System.out.println(tranInfoList.poll());
	}
	
	/**
     * 消費税抜き処理.
     *
     * @param taxIncludeAmt
     *            税込金額
     * @param taxRate
     *            税率
     * @param roudupType
     *            0:切り上げ、1:四捨五入
     * @return 税抜き金額
     */
    public static double ExcludeTax(double taxIncludeAmt, double taxRate, int roudupType) {
        double taxExcludeAmt = 0;

        if (taxIncludeAmt < 0) {
            if (roudupType == 0) {
                // 切り上げ
                taxExcludeAmt = Math.ceil(-1.0 * taxIncludeAmt * 100 / (100 + taxRate));
            } else {
                // 四捨五入
                taxExcludeAmt = Math.round(-1.0 * taxIncludeAmt * 100 / (100 + taxRate));
            }
            taxExcludeAmt = -1 * taxExcludeAmt;
        } else {
            if (roudupType == 0) {
                // 切り上げ
                taxExcludeAmt = Math.ceil(taxIncludeAmt * 100 / (100 + taxRate));
            } else {
                // 四捨五入
                taxExcludeAmt = Math.round(taxIncludeAmt * 100 / (100 + taxRate));
            }
        }

        return taxExcludeAmt;
    }
    
    public static double exec(double taxIncludeAmt, double taxRate, int roudupType) {
    	double taxExcludeAmt = 0;
    	taxExcludeAmt = Math.round(taxIncludeAmt - taxIncludeAmt * taxRate/100);
    	return taxExcludeAmt;
    }

}
