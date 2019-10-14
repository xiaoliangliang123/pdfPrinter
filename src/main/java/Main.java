import com.pdf.printer.PdfPrinter;

/**
 * @author:WANGLIANG(XIAO)
 * @Date: 2019/10/14 10:58
 * @Description :pdf 打印器主类
 */
public class Main {

    public static void main(String[] args){
        String path = "G:\\file_down\\cbzm.pdf";
        PdfPrinter pdfPrinter = new PdfPrinter();
        pdfPrinter.print(path);
    }
}
