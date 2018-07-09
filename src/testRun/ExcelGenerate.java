package testRun;
//import testRun;
import java.io.IOException;

import javax.management.modelmbean.XMLParseException;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.common.excelreport.ExcelReportGenerator;

public class ExcelGenerate {

public static void main(String[]args) throws ParserConfigurationException, IOException, SAXException, XMLParseException
{
ExcelReportGenerator.generateExcelReport("excel-report.xlsx", "D:\\test");

//Xl.generateReport("excel-report.xlsx");
}
}