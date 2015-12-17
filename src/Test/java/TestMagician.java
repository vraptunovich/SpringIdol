
import com.springinaction.springidol.mindReaders.MagicianMindReader;
import com.springinaction.springidol.mindReaders.Volunteer;
import com.springinaction.springidol.performers.Performer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;


public class TestMagician {

    ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
    Volunteer volunteer = (Volunteer) ctx.getBean("volunteer");
    MagicianMindReader magicianMindReader = (MagicianMindReader) ctx.getBean("magician");
    @Test
    public void magicianShouldReadVolunteersMind() {
        volunteer.thinkOfSomething("Queen of Hearts");
        assertEquals("Queen of Hearts", magicianMindReader.getThoughts());
    }

}
