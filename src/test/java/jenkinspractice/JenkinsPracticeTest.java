package jenkinspractice;

import org.testng.annotations.Test;

public class JenkinsPracticeTest {
	
	@Test
	public void jenkinsPracticeTest() {
		System.out.println("Hii jenkins");
		String browz = System.getProperty("Browser");
		System.out.println(browz);
	}

}
