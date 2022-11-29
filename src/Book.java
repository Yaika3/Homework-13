public class Book {
    private String nameBook;
    private int yearBook;
    Author author;




    public Book (String nameBook, int yearBook,Author author1) {
        this.nameBook = nameBook;
        this.yearBook = yearBook;
        this.author = author1;







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







}


