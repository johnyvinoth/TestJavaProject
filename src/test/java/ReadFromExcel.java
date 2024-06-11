import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
//    public static final String TEST_MAX_FILE_SIZE = ;

    public static List<List<String>> readFromExcel(String filePath) throws IOException {
        List<List<String>> data = new ArrayList<>();
        FileInputStream fis = new FileInputStream(filePath);
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            List<String> rowData = new ArrayList<>();
            Iterator<Cell> cellIterator = row.iterator();
            while (cellIterator.hasNext())
            {
                Cell cell = cellIterator.next();
                if(cell.getCellType() != CellType.BLANK)
                {

                rowData.add(getCellValueAsString(cell));
                }

            }
            if(!rowData.isEmpty())
            {

            data.add(rowData);
            }
        }
        wb.close();
        fis.close();
        return data;
    }

      private static String getCellValueAsString(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    return String.valueOf(cell.getNumericCellValue());
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }
}

