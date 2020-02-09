package cn.liao.core;

import cn.liao.test.MDFileReader;
import cn.liao.test.MDFileWriter;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Yuxiang Liao on 2020-02-09 18:30.
 */
public class Executor {
	public static void main(String[] args) throws IOException {
		MarkdownFile mdFile = new MarkdownFile();
		MDFReader.read(mdFile);
		MDFTranslator.translate(mdFile);
		DMFWriter.write(mdFile,	"/Users/liao/Desktop/test.md");
	}
}
