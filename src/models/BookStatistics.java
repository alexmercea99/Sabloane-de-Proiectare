package models;

public class BookStatistics implements Visitor
{
    private int imagesCounter=0;
    private int tablesCounter=0;
    private int paragrapghsCounter=0;


    public void visit(Image im)
    {
        imagesCounter++;
    }

    public void visit(ImageProxy imgProxy)
    {
        imagesCounter++;
    }


    public void visit(Table table)
    {
        tablesCounter++;
    }

    public void visit(Paragraph paragraph)
    {
        paragrapghsCounter++;
    }

    public void printStatistics()
    {
        System.out.println("Book Statistics : ");
        System.out.println("Number of Iamges : " + imagesCounter);
        System.out.println("Number of Tables : "+ tablesCounter);
        System.out.println("Number of Paragraphs : " + paragrapghsCounter);
    }
}