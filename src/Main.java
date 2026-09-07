public static void main(String[] args) {
    Book book1 = new Book("Капитанская дочка", 160);
    Book book2 = new Book("Война и мир", 1300);

    System.out.println("Книга: " + book1.title + ", страниц: " + book1.pages);
    System.out.println("Книга: " + book2.title + ", страниц: " + book2.pages);
}