import java.util.Objects;

//Создайте класс Book, который будет содержать в себе данные о названии,
// авторе и годе публикации книги.
class Book {
    private String title;
    private Author author;
    private int yearPublic;

    //Напишите конструкторы для обоих классов, заполняющие все поля.
    public Book(String title, Author author, int yearPublic) {
        this.title = title;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    //    Создайте геттеры для всех полей автора и всех полей книги.
    public String getTitle() {
        return title;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public Author getAuthor() {return author;}

    //Создайте сеттер для поля «Год публикации» у книги.
    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }


    public String toString() {
        return "Название='" + title + " автор" + author + ", год публикации:" + yearPublic;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return yearPublic == book.yearPublic && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublic);

    }
}
