package cn.liao;

import cn.liao.test.MDFileReader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by Yuxiang Liao on 2020-01-29 16:07.
 */
public class MDFileReaderTests {

	private static List<String> contentList;

	@BeforeAll
	static void configuration() throws FileNotFoundException {
		MDFileReader fileReader = new MDFileReader();
		contentList = fileReader.getFileContextList();
	}


	@Test
	void getFileContext(){
		assertThat(contentList.size(), is(equalTo(157)));
		assertThat(contentList.get(0),is(equalTo("# SaaS, PaaS, IaaS")));
	}
}
