package com.home.puppy.template_method;

/**
 * DataImporter
 *
 * @author hexiaogou
 * @desc abstract data importer
 * @date 2023-03-27 20:20
 */
abstract class DataImporter {
    /**
     * define import data steps
     */
    public final void importData() {
        readData();
        processData();
        saveData();
    }

    protected abstract void readData();

    protected abstract void processData();

    protected abstract void saveData();
}
