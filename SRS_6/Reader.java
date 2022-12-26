import java.time.LocalDate;
import java.util.ArrayList;
public class Reader {
    private String fullName;
    private LocalDate birthDay;
    private String faculty;
    private String phoneNumber;
    private int libraryCardNumber;
    private ArrayList<Book> takenBooks;

    public Reader(String fullName, LocalDate birthDay, String phoneNumber, String faculty, int libraryCardNumber) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        takenBooks = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }
    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", faculty='" + faculty + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", libraryCardNumber=" + libraryCardNumber +
                ", takenBooks=" + takenBooks +
                '}';
    }

    public void takeBook(Book book) {
        takenBooks.add(book);
    }

    public void returnBook(Book book) {
        if(takenBooks.contains(book)) {
            takenBooks.remove(book);
        }
    }

    public void takeBook(int colTakeBook) {
        System.out.printf("%s взял %s книги", fullName,colTakeBook);
    }

    public void returnBook(int colTakeBook) {
        System.out.printf("%s вернул %s книги", fullName, colTakeBook);
    }

    public void takeBook(String ... nameBooks) {
        System.out.printf(fullName + " взял книги: ");
        for (String nameBook : nameBooks) {
            System.out.printf(nameBook + "; ");
        }
    }

    public void returnBook(String ... nameBooks) {
        System.out.printf(fullName + " вернул книги: ");
        for (String nameBook : nameBooks) {
            System.out.printf(nameBook + "; ");
        }
    }

    public void takeBook(Book ... Books) {
        System.out.printf(fullName + " взял книги: ");
        for (Book book : Books) {
            System.out.printf(book.getBookName() + "; ");
        }
    }

    public void returnBook(Book ... Books) {
        System.out.printf(fullName + " вернул книги: ");
        for (Book book : Books) {
            System.out.printf(book.getBookName() + "; ");
        }
    }
}
