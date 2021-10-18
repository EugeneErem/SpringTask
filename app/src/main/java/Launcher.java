import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Launcher {

    public Launcher(String modules) {
        System.out.println(modules);
        String[] modulesArray = modules.split(",");

        for (int i = 0; i < modulesArray.length; i++) {
            modulesArray[i] = new StringBuilder()
                    .append(modulesArray[i])
                    .append("/src/main/resources/")
                    .append(modulesArray[i])
                    .append("/")
                    .append(modulesArray[i])
                    .append(".spring.xml")
                    .toString();
        }
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(modulesArray);
        OutputText outputText = (OutputText) applicationContext.getBean("outputText");
        System.out.println("\n" + outputText.getMessage());
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/app/app.xml");
    }

}
