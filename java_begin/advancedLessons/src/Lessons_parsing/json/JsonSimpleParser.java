package Lessons_parsing.json;

import Lessons_parsing.json.model.People;
import Lessons_parsing.json.model.Root;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonSimpleParser {
    private static final String TAG_NAME_MAIN = "name";
    private static final String TAG_PEOPLE = "people";
    private static final String TAG_NAME = "name";
    private static final String TAG_AGE = "age";

    public Root parse(){
        Root root = new Root();

        JSONParser parser = new JSONParser();
        try(FileReader reader = new FileReader("src/Lessons_parsing/json/test.json")){

            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);
            String name = (String) rootJsonObject.get(TAG_NAME_MAIN);

            JSONArray peopleJsonArray =  (JSONArray) rootJsonObject.get(TAG_PEOPLE);
            List<People> peopleList = new ArrayList<>();

            for (Object it : peopleJsonArray){
                JSONObject peopleJsonObject = (JSONObject) it;

                String namePeople = (String) peopleJsonObject.get(TAG_NAME);
                long age = (Long) peopleJsonObject.get(TAG_AGE);

                People people = new People(namePeople , (int)age);
                peopleList.add(people);
            }
            root.setName(name);
            root.setPeople(peopleList);

        } catch (Exception e) {
            System.out.println("Error open file: " + e.toString());
        }
        return root;
    }
}
