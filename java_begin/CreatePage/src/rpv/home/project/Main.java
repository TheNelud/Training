package rpv.home.project;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;


public class Main {

    private static final String FILE_PATH = new File("src\\rpv\\home\\project\\tmp\\file.pdf").getAbsolutePath();
    private static Font fontCl10 = FontFactory.getFont(new File("src\\rpv\\home\\project\\Components\\Fonts\\TimeNewRomanCl.ttf").getAbsolutePath(),
            "cp1251", BaseFont.EMBEDDED, 10);
    private static Font fontCl18 = FontFactory.getFont(new File("src\\rpv\\home\\project\\Components\\Fonts\\TimeNewRomanCl.ttf").getAbsolutePath(),
            "cp1251", BaseFont.EMBEDDED, 18);


    public static void main(String[] args) {
        System.out.println(FILE_PATH);
        try{
            Document doc = new Document(PageSize.A4.rotate());// albom list
            PdfWriter.getInstance(doc, new FileOutputStream(FILE_PATH));
            doc.open();
            addTitlePage(doc);
            addTable(doc);
            doc.close();
            System.out.println("Done");

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addTitlePage(Document doc)throws DocumentException {
        Paragraph heading = new Paragraph();
        heading.add(new Paragraph("Отчет телефонограмм", fontCl18));
        heading.setAlignment(Element.ALIGN_CENTER);
        doc.add(heading);
        Phrase dateCreate = new Phrase("Время создания отчета: "+ new Date(), fontCl10);
        doc.add(dateCreate);

    }

    private static void addTable(Document doc)throws DocumentException{

        //Create table
        PdfPTable table = new PdfPTable(6);
        float[] columnWidths = {50, 100, 400, 150, 150, 150}; // width column
        table.setWidths(columnWidths);

        //add cells in table
        PdfPCell cellHeader = new PdfPCell(new Phrase("№", fontCl10));
        cellHeader.setHorizontalAlignment(Element.ALIGN_LEFT);
        table.addCell(cellHeader);
        cellHeader = new PdfPCell(new Phrase("Дата", fontCl10));
        cellHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cellHeader);
        cellHeader= new PdfPCell(new Phrase("Текст сообщения", fontCl10));
        cellHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cellHeader);
        cellHeader = new PdfPCell(new Phrase("Создал\\отправил", fontCl10));
        cellHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cellHeader);
        cellHeader = new PdfPCell(new Phrase("Подписал", fontCl10));
        cellHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cellHeader);
        cellHeader = new PdfPCell(new Phrase("Принял", fontCl10));
        cellHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cellHeader);
        table.setHeaderRows(1);

        //input data
        String numContent = "808";
        String dateContent = "10.06.2022";
        String content = "В этом тексе нету смыла, он тестовый, поэтому ту-ту"+
                "в этом тексе нету смыла, он тестовый, поэтому ту-ту"+
                "в этом тексе нету смыла, он тестовый, поэтому ту-ту";
        String createdSentContent = "Чувачков";
        String signedContent = "Чувак";
        String hasAcceptedContent = "Чувачкин";

        // add rows in table input data
        for (int i=0; i<9; i++){
            table.addCell(new Phrase(numContent, fontCl10));
            table.addCell(new Phrase(dateContent, fontCl10));
            table.addCell(new Phrase(content, fontCl10));
            table.addCell(new Phrase(createdSentContent, fontCl10));
            table.addCell(new Phrase(signedContent, fontCl10));
            table.addCell(new Phrase(hasAcceptedContent, fontCl10));
        }

        doc.add(table);

    }
}
