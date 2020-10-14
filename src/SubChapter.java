import java.util.ArrayList;

public class SubChapter {
    String name;
    ArrayList<Image> images = new ArrayList<Image>();
    ArrayList<Paragraph> paragraphs = new ArrayList<Paragraph>();
    ArrayList<Table> tables = new ArrayList<Table>();

    public SubChapter(String n){
        name=n;
    }


    public void createNewImage(String s){
        Image i=new Image(s);
        images.add(i);
    }

    public void createNewParagraph(String s){
        Paragraph p=new Paragraph(s);
        paragraphs.add(p);
    }

    public void createNewTable(String s){
        Table p=new Table(s);
        tables.add(p);
    }

    public String toString(){
        String s;
        s="SubChapter: "+name+"\n";
        for (Paragraph el:paragraphs) {
            s=s+el.toString();
        }
        for (Image img:images) {
            s=s+img.toString();

        }
        for (Table tl:tables) {
            s = s + tl.toString();

        }

        return s;
    }


}
