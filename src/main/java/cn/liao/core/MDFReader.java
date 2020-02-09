package cn.liao.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class MDFReader {

	public static void read(MarkdownFile mdFile) throws FileNotFoundException {
		BufferedReader in = new BufferedReader(new FileReader(mdFile.getFullPath()));
		List<String> contentList = in.lines().collect(Collectors.toList());
		mdFile.setOriginalList(trimLastBlank(contentList));
	}

	private static List<String> trimLastBlank(List<String> list) {
		while (list.get(list.size() - 1).isEmpty()) {
			list.remove(list.size() - 1);
		}
		return list;
	}
}
