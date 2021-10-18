import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

public class WithdrawResources {

    public static void printResources(String path) {
        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = new Resource[0];
        try {
            resources = resourceResolver.getResources("file:" + path + "/*");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Resource resource:
             resources) {
            System.out.println(resource.getFilename());
        }
    }


}
