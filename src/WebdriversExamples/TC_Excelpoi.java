package WebdriversExamples;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class TC_Excelpoi {
public static void main (String args[]) throws Exception {
FileInputStream fi=new FileInputStream("C:\\Users\\saina\\OneDrive\\Desktop\\Testing\\Read & Write.xlsx");
	XSSFWorkbook w=new XSSFWorkbook(fi);
	XSSFSheet s=w.getSheet("Sheet1");
	System.out.println(s.getSheetName());
	System.out.println(s.getLastRowNum());
	System.out.println("  Before Updating  "+s.getRow(2).getCell(1));
	//writing data to Excel
	XSSFCell c=s.getRow(2).getCell(1);
	c.setCellValue("b");
	fi.close();
FileOutputStream fo=new FileOutputStream("C:\\Users\\saina\\OneDrive\\Desktop\\Testing\\Read & Write.xlsx");
    w.write(fo);
    System.out.println("  After Updating  "+c.getStringCellValue());
    fo.close();
}
}
