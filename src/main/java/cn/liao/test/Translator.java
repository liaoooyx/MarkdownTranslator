package cn.liao.test;


import com.google.cloud.translate.v3beta1.LocationName;
import com.google.cloud.translate.v3beta1.TranslateTextRequest;
import com.google.cloud.translate.v3beta1.TranslateTextResponse;
import com.google.cloud.translate.v3beta1.TranslationServiceClient;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yuxiang Liao on 2020-01-28 22:51.
 */
public class Translator {
	private String originText;

	private String translatedText;

	public Translator(String originText) {
		this.originText = originText;
	}

	public String getOriginText() {
		return originText;
	}

	public void setOriginText(String originText) {
		this.originText = originText;
	}

	public String getTranslatedText() {
		return translatedText;
	}

	public void setTranslatedText(String translatedText) {
		this.translatedText = translatedText;
	}

	public void translate() {
		TranslateTextResponse response = remoteInvokeGoogleAPI("liao-266522", "global", getOriginText(), "en", "zh");
		setTranslatedText(response.getTranslationsList().get(0).getTranslatedText());
	}

	public static TranslateTextResponse remoteInvokeGoogleAPI(String projectId, String location, String text,
	                                                          String sourceLanguageCode, String targetLanguageCode) {
		try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {

			LocationName locationName = LocationName.newBuilder().setProject(projectId).setLocation(location).build();

			TranslateTextRequest translateTextRequest =
					TranslateTextRequest.newBuilder().setParent(locationName.toString()).setMimeType("text/plain")
					                    .setSourceLanguageCode(sourceLanguageCode)
					                    .setTargetLanguageCode(targetLanguageCode).addContents(text).build();

			// Call the API
			TranslateTextResponse response = translationServiceClient.translateText(translateTextRequest);
			//			System.out.format("Translated Text: %s%n", response.getTranslationsList().get(0).getTranslatedText());
			return response;

		} catch (Exception e) {
			throw new RuntimeException("Couldn't create client.", e);
		}
	}

	public List<String> getTranslatedTextList() {
		return Arrays.asList(translatedText.split("\n"));
	}

	public static void main(String[] arguments) throws IOException, GeneralSecurityException {
		MDFileReader fileReader = new MDFileReader();
		String str = fileReader.getFileContextString();
		Translator translator = new Translator(str);
		translator.translate();
	}
}
