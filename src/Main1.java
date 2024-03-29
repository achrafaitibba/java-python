import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main1 {

    public static void java_python(String functionName) throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder("python3", "src/hello.py", functionName);
        processBuilder.redirectErrorStream(true);

        Process process = processBuilder.start();

        InputStream inputStream = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        int exitCode = process.waitFor();
        System.out.println("Exit code: " + exitCode);
    }

    public static void main(String[] args) throws Exception {
        // Pass the function name as a command-line argument
        String functionName = "function1"; // Change this to the desired function name
        java_python(functionName);
    }
}
