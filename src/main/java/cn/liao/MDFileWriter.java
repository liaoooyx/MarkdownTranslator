package cn.liao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Yuxiang Liao on 2020-01-29 19:46.
 */
public class MDFileWriter {

	private String path = "/Users/liao/Desktop/test.md";

	public void writeMDFile() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		writer.write("hahah");
		writer.close();
	}

	public static void main(String[] args) throws IOException {
		MDFileWriter fileWriter = new MDFileWriter();
		fileWriter.writeMDFile();
	}
}
