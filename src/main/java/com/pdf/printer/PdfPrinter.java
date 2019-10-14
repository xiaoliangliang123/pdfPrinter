package com.pdf.printer;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author:WANGLIANG(XIAO)
 * @Date: 2019/10/14 11:08
 * @Description :打印类
 */
public class PdfPrinter {
    public void print(String path) {

        try {
            PDDocument document = PDDocument.load(new File(path));
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPageable(new PDFPageable(document));

            //需要提示框则加
            if (job.printDialog()){
                job.print();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (PrinterException e) {
            e.printStackTrace();
        }

    }
}
