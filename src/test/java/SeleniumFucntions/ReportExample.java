package SeleniumFucntions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReportExample {

    ExtentReports reports =  new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("./index.html");

    @BeforeTest
    public void setup(){
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Arvind");
        spark.config().setTheme(Theme.STANDARD);
        reports.attachReporter(spark);

    }

    @Test
    public void test(){

     ExtentTest log =    reports.createTest("ReportExample");
     log.info("Info log");
     log.warning("Warning logs");
     log.fail("Fail");
     log.skip("Skip");

    }

    @AfterTest
    public void teardown(){
        reports.flush();
    }
}
