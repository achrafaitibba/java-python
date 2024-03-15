import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void java_python() throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder("python3", "/home/one-x-shield/Desktop/java-python/src/hello.py");
        processBuilder.redirectErrorStream(true);

        Process process = processBuilder.start();

        InputStream inputStream = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

    }

    public static void main(String[] args) throws Exception {
        java_python();
    }
}
