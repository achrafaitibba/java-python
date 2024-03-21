import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RemoteFile {



public static void java_python(String SCRIPT, String... params) throws Exception {
        String command = "python3 -c \"import urllib.request; exec(urllib.request.urlopen('" + SCRIPT + "').read()); function_name1('" + params[0] + "'); function_name1('" + params[1] + "')\"";
        ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", command);
        processBuilder.redirectErrorStream(true);
        Process process = processBuilder.start();
        InputStream inputStream = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

    }

}
