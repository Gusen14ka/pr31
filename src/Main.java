class Book extends Object {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public boolean equals(Object ob) {
        if(this == ob) return true;
        if(ob == null || getClass() != ob.getClass()) return false;

        Book other = (Book) ob;
        return (name.equals(other.name) && author.equals(other.author));
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Book1", "Author1");
        Book b2 = new Book("Book2", "Author2");
        Book b3 = new Book("Book1", "Author1");
        Book b4 = new Book("Book1", "Author1");

        //Пример
        System.out.println("b1 == b2: " + b1.equals(b2));
        System.out.println("b1 == b3: " + b1.equals(b3));

        // Соглашения которыми должна следовать реализация .equals

        // Рефлексивность
        System.out.println("Рефлексивность");
        System.out.println("b1 == b1: " + b1.equals(b1));

        // Симмтеричность
        System.out.println("Симметричность");
        System.out.println("b1 == b3: " + b1.equals(b3));
        System.out.println("b3 == b1: " + b3.equals(b1));

        // Транзитивность
        System.out.println("Транзитивность");
        System.out.println("b1 == b3: " + b1.equals(b3));
        System.out.println("b3 == b4: " + b3.equals(b4));
        System.out.println("b1 == b4: " + b1.equals(b4));

        // Консистентность
        System.out.println("Консистентность");
        System.out.println("b1 == b3: " + b1.equals(b3));
        System.out.println("b1 == b3: " + b1.equals(b3));
        System.out.println("b1 == b3: " + b1.equals(b3));

        // Сравнение с null
        System.out.println("Сравнение с null");
        System.out.println("b1 == null: " + b1.equals(null));
    }
}
