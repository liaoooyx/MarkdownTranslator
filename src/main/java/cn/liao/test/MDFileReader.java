package cn.liao.test;

import org.apache.commons.lang3.text.StrBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Yuxiang Liao on 2020-01-28 22:05.
 */
public class MDFileReader {

	private String path = "/Users/liao/Desktop/02_ SaaS, PaaS, IaaS.md";

	public List<String> getFileContextList() throws FileNotFoundException {
		BufferedReader in = new BufferedReader(new FileReader(path));
		List<String> contentList = in.lines().collect(Collectors.toList());
		return contentList;
	}

	public String listToString(List<String> list){
		StrBuilder strBuilder = new StrBuilder();
		list.stream().forEach(s -> {
			if ("".equals(s)) strBuilder.append("\n");
			else strBuilder.append(s).append("\n");
		});
		return strBuilder.toString();
	}

	public String getFileContextString() throws FileNotFoundException {
		return listToString(getFileContextList());
	}

	public static void main(String[] args) throws FileNotFoundException {
	}
}
