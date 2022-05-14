package Lessons_parsing.xml.Lesson_SAX;

import Lessons_parsing.xml.Lesson_SAX.model.Root;
import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class Parser {
    public Root parse(){
        /**Coздаем SAX parser
         * Затем создаем свой обработчик
         * вытаскиваем парсер из фабрики*/
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (Exception e) {
            System.out.println("Open parsing ERROR" + e.toString());
            return null;
        }
        /**Определили файл
         *парси из файла и присылай из в handler */
        File file = new File("src/Lessons_XML_parsing/Lesson_SAX/test.xml");
        try {
            parser.parse(file, handler);
        } catch (SAXException | IOException e) {
            System.out.println("SAX PARSING ERROR :" + e.toString());
            return null;
        }

        return handler.getRoot();
    }
}
