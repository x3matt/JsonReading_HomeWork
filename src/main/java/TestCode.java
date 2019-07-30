import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCode {
    @Test
    public void personListMakerTest() throws Exception{
        //"Persons.json"
        Person[] result = {new Person("Ivan",10),new Person("Andrew",22),new Person("Jacob",17)};
        assertEquals(result,Main.personArrayMaker("Persons.json"));
    }
}
