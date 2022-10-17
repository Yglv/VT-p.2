package task12_16;

public class Book implements Cloneable,Comparable<Book>{
    String title;
    String author;
    int price;
    static int edition;
    int isbn;
    public Book(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public int getPrice(){
        return price;
    }
    public String getAuthor(){
        return author;
    }

    @Override
    public String toString(){
        return String.format("Title:%s ;Price:%d ;Author:%s",title,price,author);
    }

    @Override
    public int hashCode(){
        return author.hashCode()+title.hashCode()+price*100;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (obj == null || obj.getClass()!=this.getClass()){
            return false;
        }
        var book = (Book)obj;
        return (title != null && title.equals(book.getTitle()) &&
                (price == book.getPrice()) &&
                (author != null && author.equals(book.getAuthor())));
    }

    @Override
    public Book clone(){
        return new Book(title,author,price);
    }

    @Override
    public int compareTo(Book book){
        return this.isbn - book.isbn;
    }
}
