package cn.liao.api;

import java.util.List;

public abstract class MarkdownFile {

	private String fileName;
	private String filePath;

	// for translating purpose
	private String originalText;
	private String translatedText;

	// for output purpose
	private List<String> originalList;
	private List<String> translatedList;

	public MarkdownFile(String fileName, String filePath) {
		this.fileName = fileName;
		this.filePath = filePath;
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

	public abstract List<String> stringToList(String tempStr);

	public abstract String listToString(List<String> tempList);

}
