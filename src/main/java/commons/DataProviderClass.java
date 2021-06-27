package commons;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviderClass {

    @DataProvider(name = "excel-data")
    public Object[][] getTestData() throws IOException {
        var path = System.getProperty("user.dir") + "\\src\\main\\resources\\testData\\Book1.xlsx";
        Object[][] arrObj = ExcelReader.getExcelData(path, "Sheet1");
        return arrObj;
    }
}
