import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Reader[] userLibrary = new Reader[2];
        userLibrary[0] = new Reader(
                "Иванов Сергей Петрович",
                LocalDate.of(1956, 6, 6),
                "+38(000)111-11-11",
                "Факультет 1",
                233 );
        userLibrary[1] = new Reader(
                "Петров Петр Петрович",
                LocalDate.of(1957, 7, 7),
                "+38(000)222-22-22",
                "Факультет 1",
                10001 );

        Book[] library = new Book[3];
        library[0] = new Book("Приключения барона Мюнхгаузена", "Э. Распэ");
        library[1] = new Book("Толковый словарь Ожегова", "С.В.Ожегов");
        library[2] = new Book("Википедия","Нет");

        for(Reader t :userLibrary) {
            System.out.println(t);
        }

        userLibrary[1].takeBook(library[0]);
        System.out.println(userLibrary[1]);

        userLibrary[1].returnBook(library[0]);
        System.out.println(userLibrary[1]);

        userLibrary[0].takeBook(3);
        System.out.println("");

        userLibrary[0].returnBook(3);
        System.out.println("");

        userLibrary[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        System.out.println("");

        userLibrary[0].returnBook("Приключения", "Словарь", "Энциклопедия");
        System.out.println("");

        userLibrary[0].takeBook(library[0],library[1]);
        System.out.println("");

        userLibrary[0].returnBook(library[0],library[1]);
        System.out.println("");
    }
}