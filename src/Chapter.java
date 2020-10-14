import java.util.ArrayList;

public class Chapter {
    String name;
    ArrayList<SubChapter> subChapters = new ArrayList<SubChapter>();

    public Chapter(String n){
        name=n;
    }

    public String getChapterName(){
        return name;
    }

    public int createSubChapter(String s){
        SubChapter c=new SubChapter(s);
        subChapters.add(c);
        return subChapters.indexOf(c);
    }
    public SubChapter getSubChapter(int i){
        return subChapters.get(i);
    }
    public String toString(){
        String s="Name: "+name+"\n";
        for (SubChapter sc:subChapters) {
            s=s+sc.toString();
        }
        return s;
    }


}
