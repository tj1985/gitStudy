package com.comparation;

import java.util.Comparator;
import java.util.Map;

public class MapSorter implements Comparator<Map<String,String>> {

	@Override
	public int compare(Map<String, String> o1, Map<String, String> o2) {
		int res = o1.get("sort").compareTo(o2.get("sort"));
		return res;
	}

}
