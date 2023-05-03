package com.mits.ind;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataintoExcel {

 public static void main(String[] args) throws IOException {

  FileOutputStream file = new FileOutputStream("C://SeleniumPractice//testing.xlsx");

  XSSFWorkbook workbook = new XSSFWorkbook();
  XSSFSheet sheet = workbook.createSheet("data");

  for (int i = 0; i <= 5; i++) {
   XSSFRow row = sheet.createRow(i);
   for (int j = 0; j < 3; j++) {
    row.createCell(j).setCellValue("abcdef");
   }
  }

  workbook.write(file);
  System.out.println("writing excel is completed");

 }

}