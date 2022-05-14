package lesson28;

import lesson28.Packet1.Person;

public class Test extends Person{

   public int id_public;// все досепно в пределах проекта
   private int id_private; // в классе
   int id_default; //все доступно в пределах пакета
    protected int id_protected; //доступ в пределах одного пакета ,
                                // доступны всем подклассамдаже если эти подклассы вне пакета




    public static void main(String[] args) {
        //public, private, default, protected

//        Person person1 = new Person();
//        name = "Bob";
    }

    private void techinalMethod(){}

}

class Test2{

}