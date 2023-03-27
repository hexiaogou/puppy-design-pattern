package com.home.puppy.template_method;

/**
 * CsvImporter
 *
 * @author hexiaogou
 * @desc csv importer
 * @date 2023-03-27 20:23
 */
public class CsvImporter extends DataImporter {
    @Override
    protected void readData() {
        System.out.println("read data from csv file.");
    }

    @Override
    protected void processData() {
        System.out.println("process csv data.");
    }

    @Override
    protected void saveData() {
        System.out.println("save csv data.");
    }
}
