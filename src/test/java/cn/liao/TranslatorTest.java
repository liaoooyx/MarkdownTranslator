package cn.liao;

import com.google.cloud.translate.v3beta1.TranslateTextResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


/**
 * Created by Yuxiang Liao on 2020-01-29 16:41.
 */
public class TranslatorTest {

	@BeforeAll
	static void config(){

	}

	@Test
	void translate(){
		TranslateTextResponse response = Translator.remoteInvokeGoogleAPI("liao-266522", "global", "test", "en", "zh");
		String translatedText = response.getTranslationsList().get(0).getTranslatedText();
		assertThat(translatedText,is(equalTo("测试")));
	}
}
