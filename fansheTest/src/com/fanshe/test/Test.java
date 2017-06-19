package com.fanshe.test;

public class Test {

	public static void main(String[] args) {
		double amount = ExcludeTax(10000,10,1);
		System.out.println(amount);
		System.out.println(exec(10000,10,1));
	}
	
	/**
     * ����Ŕ�������.
     *
     * @param taxIncludeAmt
     *            �ō����z
     * @param taxRate
     *            �ŗ�
     * @param roudupType
     *            0:�؂�グ�A1:�l�̌ܓ�
     * @return �Ŕ������z
     */
    public static double ExcludeTax(double taxIncludeAmt, double taxRate, int roudupType) {
        double taxExcludeAmt = 0;

        if (taxIncludeAmt < 0) {
            if (roudupType == 0) {
                // �؂�グ
                taxExcludeAmt = Math.ceil(-1.0 * taxIncludeAmt * 100 / (100 + taxRate));
            } else {
                // �l�̌ܓ�
                taxExcludeAmt = Math.round(-1.0 * taxIncludeAmt * 100 / (100 + taxRate));
            }
            taxExcludeAmt = -1 * taxExcludeAmt;
        } else {
            if (roudupType == 0) {
                // �؂�グ
                taxExcludeAmt = Math.ceil(taxIncludeAmt * 100 / (100 + taxRate));
            } else {
                // �l�̌ܓ�
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
