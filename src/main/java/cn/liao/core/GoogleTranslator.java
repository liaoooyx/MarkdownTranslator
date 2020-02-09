package cn.liao.core;

import com.google.cloud.translate.v3beta1.LocationName;
import com.google.cloud.translate.v3beta1.TranslateTextRequest;
import com.google.cloud.translate.v3beta1.TranslateTextResponse;
import com.google.cloud.translate.v3beta1.TranslationServiceClient;

/**
 * Created by Yuxiang Liao on 2020-02-09 17:33.
 */
public class GoogleTranslator {

	private String projectId = "liao-266522";
	private String location = "global";
	private String sourceLanguageCode = "en";
	private String targetLanguageCode = "zh";

	public String translate(String text) {
		TranslateTextResponse response =
				remoteInvokeGoogleAPI(projectId, location, text, sourceLanguageCode, targetLanguageCode);
		return response.getTranslationsList().get(0).getTranslatedText();
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
			return response;
		} catch (Exception e) {
			throw new RuntimeException("Couldn't create client.", e);
		}
	}
}
