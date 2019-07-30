
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        Person[] persons = personListMaker("Persons.json");
        for (int i=0;i<persons.length;i++){
            System.out.println(persons[i]);
        }
    }
    public static Person[] personListMaker(String fileName) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        List<Person> list = new ArrayList<>();

       return mapper.readValue(new File(fileName),Person[].class);
    }
}
