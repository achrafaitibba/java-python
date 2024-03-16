import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main2 {

    public static void java_python(String functionName, String... params) throws Exception {
        // Build the command to include function name and parameters
        String[] command = new String[params.length + 3];
        command[0] = "python3";
        command[1] = "/home/one-x-shield/Desktop/java-python/src/test.py";
        command[2] = functionName;
        System.arraycopy(params, 0, command, 3, params.length);
        ProcessBuilder processBuilder = new ProcessBuilder(command);
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
        //String functionName = "function1"; // Change this to the desired function name
        String functionName = "function1"; // Change this to the desired function name
        String param1 = "param1"; // Change this to the desired parameter
        String param2 = "param2";
        java_python(functionName, param1, param2);
    }
}
