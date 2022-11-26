public class Main {



    public static void main(String[] args) {
        String nameJack = "Jack";
        String surnameLondon = "London";
        int yearBookMurderOnTheOrientExpress = 1933;




        Author Jack = new Author("Jack", "London");
        System.out.println("nameJack = " + Jack.getName());
        System.out.println("surnameLondon = " + Jack.getSurname());
        Author Agatha = new Author("Agatha","Christie");
        System.out.println("Agatha.getName() = " + Agatha.getName());
        System.out.println("Agatha.getSurname() = " + Agatha.getSurname());


        Book Martin = new Book("MartinEden", 1909);
        System.out.println("nameBookMartinEden = " + Martin.getNameBook());
        System.out.println("yearBookMartinEden = " + Martin.getYearBook());
        Martin.setYearBook(1910);
        System.out.println("Book.getYearBook() = " + Martin.getYearBook());
        Book Murder = new Book("MurderOnTheOrientExpress", 1933);
        System.out.println("Murder.getNameBook() = " + Murder.getNameBook());
        System.out.println("Murder.getYearBook() = " + Murder.getYearBook());









    }



}