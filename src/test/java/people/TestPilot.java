package people;

import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class TestPilot {
    @Test
    public void pilotTest1() {
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof Person);
    }
    @Test
    public void pilotTest2() {
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof Pilot);
    }
}
