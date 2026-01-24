package session13;

import java.util.List;

public interface CsvExporteble {
    void exportToCsv();
}

abstract class Report{
    public String title;
    public List<String> data;

    Report(String title, List<String> data){
        this.title = title;
        this.data = data;
    }

    public void display(){
        System.out.println("Title = " + title);
    }

    public abstract void showPreview();
}

class CsvReport extends Report implements CsvExporteble{

    CsvReport(String title, List<String> data){
        super(title, data);
    }

    @Override
    public void showPreview(){
        System.out.println("Preview: " + data);
    }

    @Override
    public void exportToCsv(){
        System.out.println("export");
    }
}

interface PdfEportable{
    void exportToPdf();
    void showDetails();
}

class PdfReport extends Report implements PdfEportable{

    PdfReport(String title, List<String> data){
        super(title, data);
    }

    @Override
    public void showPreview(){
        System.out.println("Prieviw: " + data);
    }

    @Override
    public void exportToPdf(){
        System.out.println("export to pdf future");
    }

    @Override
    public void showDetails(){
        System.out.println("Title: " + title + " data: " + data);
    }
}

class Main{
    static void main() {
        CsvReport csvReport = new CsvReport("Finance Report Table", List.of("1", "2", "3"));
        csvReport.display();
        csvReport.showPreview();
        csvReport.exportToCsv();

        PdfReport pdfReport = new PdfReport("Finance Manual", List.of("Header", "body"));
        pdfReport.display();
        pdfReport.showPreview();
        pdfReport.exportToPdf();
        pdfReport.showDetails();
    }
}