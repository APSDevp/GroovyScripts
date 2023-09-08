import java.io.*;
import java.util.Properties;

println("hi")

FileReader reader = null;
FileWriter writer = null;

File file = new File("C:\\Users\\HI\\Desktopproptest.properties");

file.createNewFile() 

try {
            reader = new FileReader(file);
            writer = new FileWriter(file);

            Properties p = new Properties();
            p.load(reader);

            p.setProperty("name","dhinesh");
            p.store(writer,"write a file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }