package cn.liao.core;

public class MDFTranslator {

	public static void translate(MarkdownFile mdFile) {
		GoogleTranslator googleTranslator = new GoogleTranslator();
		String text = googleTranslator.translate(mdFile.getOriginalText());
		mdFile.setTranslatedText(text);
	}

}
