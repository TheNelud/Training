package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{


    public void getBook(){
        System.out.println("We take book from UniLibrary " );
    }

    public void getMagazine(){
        System.out.println("We take magazine from UniLibrary");
    }

    public void returnBook(){
        System.out.println("We to back book from UniLibrary");
    }

    public void returnMagazine(){
        System.out.println("We to back magazine from UniLibrary");
    }

    public void addBook(){
        System.out.println("We add book in UniLibrary");
    }

    public void addMagazine(){
            System.out.println("We add book in UniLibrary");
        }


}
