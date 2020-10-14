public class Author {
    String name;

    public Author(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Nume: "+ getName();
    }
}
