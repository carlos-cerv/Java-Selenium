package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/Users/carlos.eduardo/IdeaProjects/qa-automation/src/resources/mac/chromedriver");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver");
    }

}
