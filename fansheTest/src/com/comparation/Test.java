package com.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		int m =7;
		        for (int i = 0; i < m; i++) {
		            int t =0; //t是用来存放距离边界需要多少空格
		            if (i >= m / 2) {// >是m为奇数的情况下的判断，=是m为偶数的情况下的判断，这里将过半的那些i值转换为与它对称的i值
		                t = m - 1 - i;
		            }else{
		                t = i;
		            }
		            for (int j = 1; j <= m; j++) {
		                if (j >= (m + 1) / 2 - t && j <= (m + 1) / 2 + t) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.print("\n");
		        }
		}
}