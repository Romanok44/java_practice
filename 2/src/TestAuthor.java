public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("John Park", "johnpark@gmail.com", 'M');
        Author a2 = new Author("Max Caulfield", "maxine@gmail.com", 'W');
        a1.setEmail("noctus@gmail.com");                    // установим новую почту для автора
        System.out.println(a1);                             // вывод данных об авторе
        System.out.println(a2);                   // вывод всех данных об авторе
    }
}