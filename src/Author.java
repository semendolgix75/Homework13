import java.util.Objects;

//Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
class Author {
    private String name;
    private String surname;

    //Напишите конструкторы для обоих классов, заполняющие все поля.
    public Author() {
        this.name = name;
        this.surname = surname;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //    Создайте геттеры для всех полей автора и всех полей книги.
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //    Реализуйте методы toString, equals и hashCode в классах Author и Book
    public String toString() {
        return "Автор: " + this.getSurname() + " " + this.getName();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Author author = (Author) object;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}

