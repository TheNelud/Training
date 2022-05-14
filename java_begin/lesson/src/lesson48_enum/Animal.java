package lesson48_enum;

public enum Animal {
    DOG("Собака"), CAT("Кошка"), FROG("Лягушка");

    private String translation;

    Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString(){
        return "Перевод на русский язык: "+ translation;
    }
}
