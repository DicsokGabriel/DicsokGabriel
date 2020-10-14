import java.util.ArrayList;

public class Book {
    String title;
    ArrayList<Author> authors = new ArrayList<Author>();
    ArrayList<Chapter> chapters = new ArrayList<Chapter>();



    public Book(String t){
        title=t;
    }
    public void addAuthor(Author a){
        authors.add(a);
    }
    public void addChapter(Chapter a){
        chapters.add(a);
    }
    public String getTitle(){
        return title;
    }

    public String toString(){
        return "Titlu"+getTitle();
    }

    public int createChapter(String s){
        Chapter c = new Chapter(s);
        chapters.add(c);
        return chapters.indexOf(c);
    }
    public Chapter getChapter(int i){
        return chapters.get(i);

    }

}
