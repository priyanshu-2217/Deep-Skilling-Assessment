package DesignPatterns.FactoryMethodPatternExample;

public class Test {
    public static void main(String[] args) {
        // Word Document
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        // PDF Document
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        // Excel Document
        DocumentFactory excelFactory = new ExceldocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
