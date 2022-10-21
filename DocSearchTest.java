import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DocSearchTest {
    @Test
    public void testHandleRequest() throws IOException, URISyntaxException{
        URI u = new URI("http://localhost:4001");
        Handler h = new Handler("./technical");
        assertEquals("Don't know how to handle that path!", h.handleRequest(u));
    }
}
