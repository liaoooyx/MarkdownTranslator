package cn.liao.core;

import java.util.Arrays;
import java.util.List;

public class MarkdownFile {

	private String fileName = "03_ Federated Cloud 联合云.md";
	private String filePath = "/Users/liao/OneDrive - University of Leeds/Cloud Computing/笔记";
	private String fullPath;

	// for translating purpose
	private String originalText;
	private String translatedText;

	// for output purpose
	private List<String> originalList;
	private List<String> translatedList;

	public MarkdownFile(){
		setFullPath(filePath+"/"+fileName);
	}

	public MarkdownFile(String filePath,String fileName) {
		this.filePath = filePath;
		this.fileName = fileName;
		setFullPath(filePath+"/"+fileName);
	}

	public String getFullPath() {
		return fullPath;
	}

	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getOriginalText() {
		if (originalText == null){
			originalText = listToString(originalList);
		}
		return originalText;
	}

	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}

	public String getTranslatedText() {
		if (translatedText == null){
			translatedText = listToString(translatedList);
		}
		return translatedText;
	}

	public void setTranslatedText(String translatedText) {
		this.translatedText = translatedText;
	}

	public List<String> getOriginalList() {
		if (originalList == null){
			originalList = stringToList(originalText);
		}
		return originalList;
	}

	public void setOriginalList(List<String> originalList) {
		this.originalList = originalList;
	}

	public List<String> getTranslatedList() {
		if (translatedList == null){
			translatedList = stringToList(translatedText);
		}
		return translatedList;
	}

	public void setTranslatedList(List<String> translatedList) {
		this.translatedList = translatedList;
	}

	public List<String> stringToList(String tempStr) {
		return Arrays.asList(tempStr.split("\n"));
	}


	public String listToString(List<String> tempList) {
		StringBuilder strBuilder = new StringBuilder();
		tempList.stream().forEach(s -> {
			if ("".equals(s))
				strBuilder.append("\n");
			else
				strBuilder.append(s).append("\n");
		});
		return strBuilder.toString();
	}

}
