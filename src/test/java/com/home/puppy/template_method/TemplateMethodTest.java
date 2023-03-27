package com.home.puppy.template_method;

import org.junit.jupiter.api.Test;

/**
 * TemplateMethodTest
 *
 * @author hexiaogou
 * @desc template method test
 * @date 2023-03-27 20:25
 */
public class TemplateMethodTest {
    @Test
    public void templateMethodPatternTest() {
        DataImporter csvImporter = new CsvImporter();
        csvImporter.importData();

        DataImporter excelImporter = new ExcelImporter();
        excelImporter.importData();
    }
}
