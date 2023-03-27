package com.home.puppy.template_method;

/**
 * ExcelImporter
 *
 * @author hexiaogou
 * @desc excel importer
 * @date 2023-03-27 20:24
 */
public class ExcelImporter extends DataImporter {
    @Override
    protected void readData() {
        System.out.println("read data from excel file.");
    }

    @Override
    protected void processData() {
        System.out.println("process excel data.");
    }

    @Override
    protected void saveData() {
        System.out.println("save excel data.");
    }
}
