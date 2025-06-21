package DesignPatterns.FactoryMethodPatternExample;

public class ExceldocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}
