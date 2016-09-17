package com.mahl.util;

import java.util.List;

public class PageControl {

	public static int getTotal_Pages(int total_record, int page_record) {
		int total_Pages = 0;
		int test;
		test = total_record % page_record;
		if (test == 0)
			total_Pages = total_record / page_record;
		else
			total_Pages = total_record / page_record + 1;
		return total_Pages;
	}

	public static <T> List<T> getList(List<T> list, int curpage, int per_pagesize) {

		int start = (curpage - 1) * per_pagesize;
		int end = ((curpage - 1) * per_pagesize + per_pagesize) >= list.size() ? (list.size())
				: ((curpage - 1) * per_pagesize + per_pagesize);
		return list.subList(start, end);
	}

}
