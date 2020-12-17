package WebdriversExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import jxl.*;

public class TC_Excel {
public static void main(String args[]) throws Exception  {
FileInputStream fi=new FileInputStream("C:\\Users\\saina\\OneDrive\\Desktop\\Testing\\Read.xls");
Workbook w=Workbook.getWorkbook(fi);
Sheet s=w.getSheet("Sheet1");
System.out.println(s.getName());
int i=2;
String EmpID=s.getCell(0,i).getContents();
String EmpName=s.getCell(1,i).getContents();
String EmpMail=s.getCell(2,i).getContents();
String EmpNumber=s.getCell(3,i).getContents();
System.out.println(EmpID);
System.out.println(EmpName);
System.out.println(EmpMail);
System.out.println(EmpNumber);
}
}
