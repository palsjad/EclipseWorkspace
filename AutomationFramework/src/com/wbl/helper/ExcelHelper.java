package com.wbl.helper;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {

	public static Object[][] getData(String fileName) {

		Object data[][] = null;

		XSSFWorkbook wb = null;

		try {

			// loading excel file into java XSSF object

			wb = new XSSFWorkbook(new FileInputStream(Constants.PATH + fileName));

			// System.out.println("file name inside excel getdata() is : " +
			// Constants.PATH + fileName);
			XSSFSheet sheet = wb.getSheet("Login");

			int rows = sheet.getLastRowNum(); // gives index value for last row
			System.out.println("row number : " + rows);

			data = new Object[rows][];

			for (int i = 1; i < rows; i++) {

				XSSFRow row = sheet.getRow(i);

				int noOfCols = row.getLastCellNum(); // gives last value for
														// last column

				System.out.println("columns   : " + noOfCols);

				String[] colData = new String[noOfCols];

				for (int j = 0; j < noOfCols; j++) {

					colData[j] = row.getCell(j).getStringCellValue();
				}

				data[i - 1] = colData;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != wb) {

					wb.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		System.out.println("final data " + data.toString());

		return data;

	}

}
