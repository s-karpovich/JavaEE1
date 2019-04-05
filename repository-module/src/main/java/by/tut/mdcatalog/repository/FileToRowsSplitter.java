package by.tut.mdcatalog.repository;

import java.util.ArrayList;
import java.util.List;

public class FileToRowsSplitter {
    public List<String> getRowsFromFile(String fileName) {
        List<String> rowsList = new ArrayList<>();
        rowsList.add("1,1,2,9,9");
        rowsList.add("2,2,5,5,5");
        return rowsList; // stub
    }
}
