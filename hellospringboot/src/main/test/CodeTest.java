import com.example.hellospringboot.HellospringbootApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = HellospringbootApplication.class)
@Slf4j
public class CodeTest {

    @Test
    public void codeTest()  {
        System.out.println("aaa");
    }
}
