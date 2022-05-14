package Lessons_parsing.xml.Lesson_SAX;

import Lessons_parsing.xml.Lesson_SAX.model.People;

import Lessons_parsing.xml.Lesson_SAX.model.Root;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxParserHandler extends DefaultHandler {
    /**Набор тегов*/
    private static final String TAG_NAME_MAIN = "name";
    private static final String TAG_PEOPLE = "people";
    private static final String TAG_ELEMENT = "element";
    private static final String TAG_NAME = "name";
    private static final String TAG_AGE = "age";
    private Root root = new Root();
    private List<People> peopleList =new ArrayList<>();
    /**Текущий тег*/
    private  String currentTagName;
    /**Находимся ли внутри тега people */
    private boolean isPeople = false;
    /**Находимся ли в нутри тега Element*/
    private  boolean isElement = false;

    private String name;
    private int age;

    public Root getRoot(){
       return root;
    }

    /**Метод который вызывается на старте документа*/
    @Override
    public void startDocument() throws SAXException {
//        System.out.println("Start document");
    }
    /**И при закрытие документа вызывается следуюющий метод
     * где в root  закидываем лист */
    @Override
    public void endDocument() throws SAXException {
//        System.out.println("End document");
        root.setPeople(peopleList);
    }

    /**Как только стартует элемент, записываем его в currentTagName(Для того что бы понимать в каком теге мы находимся)
     * если это тег people то мы себе помечаем что находимся внутри тега people*/
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //System.out.println("Start element "+ qName);
        currentTagName = qName;
        if (currentTagName.equals(TAG_PEOPLE)){
            isPeople = true;
        }else if(currentTagName.equals(TAG_ELEMENT)){
            isElement = true;
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
//        System.out.println("End element "+ qName);
        if (qName.equals(TAG_PEOPLE)){
            isPeople = false;
        }else if (qName.equals(TAG_ELEMENT)){
            isElement = false;
            People people = new People(name, age);
            peopleList.add(people);
        }
        currentTagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
//        System.out.println("characters: " + new String(ch, start, length));
        if (currentTagName == null)
            return;
        if (!isPeople && currentTagName.equals(TAG_NAME_MAIN)){
            root.setName(new String(ch, start, length));
        }

        if (isPeople && isElement){
            if(currentTagName.equals(TAG_NAME)){
                name = new String(ch, start, length);
            }else if (currentTagName.equals(TAG_AGE)){
                age = Integer.parseInt(new String(ch, start, length));
            }
        }
    }
}
