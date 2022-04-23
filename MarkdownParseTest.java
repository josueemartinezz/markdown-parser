import static org.junit.Assert.*;
import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testGetLinks() throws IOException{


        //System.out.println(pathToFile.toAbsolutePath());

        //assertEquals("hello", pathToFile.toAbsolutePath());
        //C:\Users\Josue Martinez\AppData\Roaming\Code\User\workspaceStorage\88ee0edbf9197bdd8a912b5000d61c35\redhat.java\jdt_ws\markdown-parser_c2433895\test-file.md

        Path fileName = Path.of("C:\Users\Josue Martinez\AppData\Roaming\Code\User\workspaceStorage\88ee0edbf9197bdd8a912b5000d61c35\redhat.java\jdt_ws\markdown-parser_c2433895\test-file.md");
        String content = Files.readString(fileName);
        ArrayList <String> result = new ArrayList<String>();
        
        assertEquals(result, MarkdownParse.getLinks(content));
    }
}