public class Main {



    public static void main(String[] args) {
        String nameJack = "Jack";
        String surnameLondon = "London";
        String nameBookMartinEden = "Martin Eden";
        int yearBookMartinEden = 1909;
        String nameAgatha = "Agatha";
        String surnameChristie = "Christie";
        String nameBookMurderOnTheOrientExpress = "Murder on the orient express";
        int yearBookMurderOnTheOrientExpress = 1933;



        Author author = new Author("Jack", "London","Agatha", "Christie");
        System.out.println("nameJack = " + nameJack);
        System.out.println("surnameLondon = " + surnameLondon);
        System.out.println("nameAgatha = " + nameAgatha);
        System.out.println("surnameChristie = " + surnameChristie);


        Book book = new Book("Martin Eden", 1909, "Murder on the orient express", 1933);
        System.out.println("nameBookMartinEden = " + nameBookMartinEden);
        System.out.println("yearBookMartinEden = " + yearBookMartinEden);
        System.out.println("nameBookMurderOnTheOrientExpress = " + nameBookMurderOnTheOrientExpress);
        System.out.println("yearBookMurderOnTheOrientExpress = " + yearBookMurderOnTheOrientExpress);






    }



}