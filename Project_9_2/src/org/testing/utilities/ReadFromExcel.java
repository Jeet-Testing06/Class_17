// This utility works with TC5 only just to understand


package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadFromExcel {
	
	public static String read_excel(int r, int c) throws BiffException, IOException
	{
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jeet.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		return ws.getCell(r, c).getContents();
		
	}
	

}