public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){          // Конструктор
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {                                       // получить имя
        return name;
    }
    public String getEmail() {                                      // получить емаил
        return email;
    }
    public void setEmail(String email) {                            // установить почту
        this.email = email;
    }
    public char getGender() {                                       // получить пол
        return gender;
    }
    public String toString(){                                       // Все данные об авторе
        return this.name+", gender: "+this.gender+", "+this.email;
    }
}