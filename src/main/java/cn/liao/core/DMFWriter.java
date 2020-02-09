package cn.liao.core;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class DMFWriter {

	public static void write(MarkdownFile mdFile, String outputPath) throws IOException {
		List<String> olist = mdFile.getOriginalList();
		List<String> tList = mdFile.getTranslatedList();
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
		for (int i = 0; i < olist.size(); i++) {
			writer.write(olist.get(i));
			writer.newLine();
			String str = tList.get(i);
			if (!str.startsWith("#")){
				writer.write(str);
				writer.newLine();
			}
			if (i % 50 == 0) {
				writer.flush();
			}
		}
		writer.flush();
		writer.close();
	}

}
