public class Main {
    public static void main(String[] args) {
        DocumentFactory WordFactory = new WordDocumentFactory();
        Document wordDoc = WordFactory.createDocument();
        wordDoc.open();

         DocumentFactory pdfFactory = new WordDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
    
}
