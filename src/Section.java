import java.util.ArrayList;

public class Section {
    String sectionTitle;
    ArrayList<Element> content=new ArrayList<Element>();

    public int add(Element elm){
        content.add(elm);
        return content.indexOf(elm);
    }

    public void remove(Element elm){
        content.remove(elm);
    }

    public Element getElement(int index){
        return content.get(index);
    }
    
}
