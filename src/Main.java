//Создайте отдельный класс для запуска приложения
public class Main {
    // и объявите метод main  в нем.
    public static void main(String[] args) {
//В методе
//main
// создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор»
// (достаточно тоже двух) и инициализируйте их.
        System.out.println("\nЗадание 12 \n");
        Author author1 = new Author("Ivan", "Turgenev");
        Author author2 = new Author("Anton", "Chehov");
        Author author3 = new Author("Anton", "Chehov");
        System.out.println("Автор 1 - " + author1.getName() + " " + author1.getSurname());
        System.out.println("Автор 2 - " + author2.getName() + " " + author2.getSurname());
        Book book1 = new Book("Mu-Mu", author1, 2013);
        Book book2 = new Book("Chayka", author2, 2016);
        Book book3 = new Book("Chayka", author2, 2016);
        System.out.println("Книга 1 - " + book1.getTitle() + " автор " + author1.getName() + " " + author1.getSurname() + " год публикации " + book1.getYearPublic());
        System.out.println("Книга 2 - " + book2.getTitle() + " автор " + author2.getName() + " " + author2.getSurname() + " год публикации " + book2.getYearPublic());
//        В том же методе  main измените год публикации одной из книг с помощью сеттера.
        book1.setYearPublic(2020);
        System.out.println("Книга 1 изменение года публикации- " + book1.getTitle() + " автор " + author1.getName() + " " + author1.getSurname() + " год публикации " + book1.getYearPublic());

        System.out.println("\nЗадание 13 \n");
//      Проверка метода toString
        System.out.println("\nВывод метода toString класса Book");

        System.out.println("book1.toString() = " + book1.toString());
        System.out.println("book2.toString() = " + book2.toString());
        System.out.println("book3.toString() = " + book3.toString());

        System.out.println("Вывод сравнения методом equals и Hashcode для класса Book ");

        System.out.println("book1.equals(book2) = " + book1.equals(book2));
        System.out.println("book3.equals(book2) = " + book3.equals(book2));


        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());
        System.out.println("book3.hashCode() = " + book3.hashCode());


        System.out.println("\nВывод метода toString класса Author");
        System.out.println("author1.toString = "+author1.toString());
        System.out.println("author2.toString = "+author2.toString());
        System.out.println("author3.toString = "+author3.toString());

//      Проверка метода equals
        System.out.println("Вывод сравнения методом equals и Hashcode для класса Author ");

        System.out.println("author1.equals(author3) = " + author1.equals(author3));
        System.out.println("author2.equals(author3) = " + author2.equals(author3));

        System.out.println("author1.hashCode() = " + author1.hashCode());
        System.out.println("author2.hashCode() = " + author2.hashCode());
        System.out.println("author3.hashCode() = " + author3.hashCode());



    }
}



