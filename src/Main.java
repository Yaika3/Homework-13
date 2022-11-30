public class Main {



    public static void main(String[] args) {



        Author Jack = new Author("Jack", "London");
        System.out.println("nameJack = " + Jack.getName());
        System.out.println("surnameLondon = " + Jack.getSurname());
        System.out.println("Jack = " + Jack);


        Book Martin = new Book("Martin Eden", 1909,new Author(Jack.getName(), Jack.getSurname()));
        System.out.println("nameBookMartinEden = " + Martin.getNameBook());
        System.out.println("yearBookMartinEden = " + Martin.getYearBook());
        Martin.setYearBook(1910);
        System.out.println("Book.getYearBook() = " + Martin.getYearBook());
        System.out.println("Martin = " + Martin);  // Метод toString



        Author Agatha = new Author("Agatha","Christie");
        System.out.println("Agatha.getName() = " + Agatha.getName());
        System.out.println("Agatha.getSurname() = " + Agatha.getSurname());

        Book Murder = new Book("Murder On The Orient Express", 1933,new Author(Agatha.getName(), Agatha.getSurname()));
        System.out.println("Murder.getNameBook() = " + Murder.getNameBook());
        System.out.println("Murder.getYearBook() = " + Murder.getYearBook());




    }



}