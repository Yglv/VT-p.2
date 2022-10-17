package task12_16;

public class ProgrammerBook extends Book{
    String language;
    int level;
    public ProgrammerBook(String title,String author,int price,String language,int level){
        super(title,author,price);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString(){
        return String.format("%s ;Language:%s ;Level:%d",super.toString(),language,level);
    }

    @Override
    public int hashCode(){
        return super.hashCode()+language.hashCode()+level*100;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (obj == null || obj.getClass()!=this.getClass()){
            return false;
        }
        var book = (ProgrammerBook)obj;
        return (title != null && title.equals(book.getTitle()) &&
                (price == book.getPrice()) &&
                (author != null && author.equals(book.getAuthor())) &&
                (language!=null && language.equals(book.getLanguage())) &&
                (level == book.getLevel()));
    }
}
