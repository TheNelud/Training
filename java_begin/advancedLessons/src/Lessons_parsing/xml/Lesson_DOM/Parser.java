package Lessons_parsing.xml.Lesson_DOM;

import Lessons_parsing.xml.Lesson_DOM.model.People;
import Lessons_parsing.xml.Lesson_DOM.model.Root;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    /**Вынесли все теги в константы*/
    private static final String TAG_NAME_MAIN = "name";
    private static final String TAG_PEOPLE = "people";
    private static final String TAG_ELEMENT = "element";
    private static final String TAG_NAME = "name";
    private static final String TAG_AGE = "age";

    public Root parse(){
        Root root = new Root(); /** Создали элемент который нужно запомнить*/

        /**Открыли файл*/
        Document document;
        try {
            document = buildDocument();
        }catch (Exception e ){
            System.out.println("Open parsing error " + e.toString());
            return null;
        }
        /**Получили root елемент*/
        Node rootNode =  document.getFirstChild();
        NodeList rootChileds = rootNode.getChildNodes();

        String mainName = null;
        Node peopleNode = null;
        /**Начали ходить по содержимому root элементу*/
        for (int i = 0; i < rootChileds.getLength(); i++) {
            if(rootChileds.item(i).getNodeType() != Node.ELEMENT_NODE) continue;
//            System.out.println("2 : " + rootChileds.item(i).getNodeName());
            switch (rootChileds.item(i).getNodeName()){
                /**Получили имя тега*/
                case TAG_NAME_MAIN : {
                    mainName =  rootChileds.item(i).getTextContent();
//                    System.out.println("<Name> : " + mainName);
                    break;
                }
                case TAG_PEOPLE :{
                    peopleNode = rootChileds.item(i);
                    break;
                }
            }
        }

        if (peopleNode == null){
            return null;
        }

        List<People> peopleList = parsPeople(peopleNode);
        root.setName(mainName);
        root.setPeople(peopleList);

        System.out.println("Root: " + root.toString());

        root.getPeople().stream().filter(people -> {
            return  people.getAge() == 28;
        }).forEach(people -> {
            System.out.println("People: " + people.toString());
        });

        return root;
    }

    private Document buildDocument() throws Exception{
        File file = new File("src/Lessons_XML_parsing/Lesson_DOM/test.xml");
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        return builderFactory.newDocumentBuilder().parse(file);


    }
    private List<People> parsPeople(Node peopleNode){
        /**Парсим тег People
         * вытаскиваем каждый элемент этого  тега
         * и вызываем parsElement*/
        List<People> peopleList = new ArrayList<>();
        NodeList peopleChilds = peopleNode.getChildNodes();
        for (int i = 0; i < peopleChilds.getLength(); i++) {
            if(peopleChilds.item(i).getNodeType() != Node.ELEMENT_NODE)
                continue;
            if(!peopleChilds.item(i).getNodeName().equals(TAG_ELEMENT))
                continue;

            People people = parsElement(peopleChilds.item(i));
            peopleList.add(people);
        }
        return peopleList;
    }

    private People parsElement(Node elmentNode){
        /**Парсим более глубойкий элемент
         * берем нужные данные и возвращаем People*/
        String name = null;
        int age = 0;
        NodeList elementChilds = elmentNode.getChildNodes();

        for (int j = 0; j < elementChilds.getLength(); j++) {
            if (elementChilds.item(j).getNodeType() != Node.ELEMENT_NODE)
                continue;

            switch (elementChilds.item(j).getNodeName()){
                case TAG_NAME:{
                    name = elementChilds.item(j).getTextContent();
                    break;
                }
                case TAG_AGE:{
                    age = Integer.parseInt(elementChilds.item(j).getTextContent());
                    break;
                }
            }
        }
        return new People(name, age);
    }
}
