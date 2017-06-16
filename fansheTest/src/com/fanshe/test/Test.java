package com.fanshe.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QRPromotion qrp = new QRPromotion();
		qrp.setQRBmpFileCnt("123");
		String path="com.fanshe.test.QRPromotion";
		Class onwClass = null;
		try {
			onwClass = Class.forName(path);
			Object o = onwClass.newInstance();
			o=qrp;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
