public class Main {



    public static void main(String[] args) {
        String nameJack = "Jack";
        String surnameLondon = "London";
        int yearBookMurderOnTheOrientExpress = 1933;




        Author author = new Author("Jack", "London","Agatha", "Christie");
        System.out.println("nameJack = " + nameJack);
        System.out.println("surnameLondon = " + surnameLondon);
        System.out.println("nameAgatha = " + author.getName());
        System.out.println("surnameChristie = " + author.getSurname());


        Book Book = new Book();
        System.out.println("nameBookMartinEden = " + Book.getNameBook());
        System.out.println("yearBookMartinEden = " + Book.getYearBook());
        Book.setYearBook(1910);
        System.out.println("Book.getYearBook() = " + Book.getYearBook());


        System.out.println("nameBookMurderOnTheOrientExpress = " + Book.getNameBook());
        System.out.println("yearBookMurderOnTheOrientExpress = " + yearBookMurderOnTheOrientExpress);







    }



}