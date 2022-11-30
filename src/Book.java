import java.util.Objects;

public class Book {
    private String nameBook;
    private int yearBook;
    Author author;




    public Book (String nameBook, int yearBook,Author author1) {
        this.nameBook = nameBook;
        this.yearBook = yearBook;
        this.author = author1;







    }
    public Author getAuthor(){
        return author;
    }
    public String getNameBook(){
        return nameBook ;



    }
    public  int getYearBook(){
        return yearBook;
    }


    public void setYearBook (int yearBook) {
        this.yearBook = yearBook;
    }
    public String toString (){
        return "Название книги " + nameBook;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(nameBook, book.nameBook)&& Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearBook);
    }







}


