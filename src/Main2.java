import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public synchronized static List<String> getAllMembers(String groupId) throws Exception {
        ArrayList<String> data = new ArrayList<>();
        ProcessBuilder processBuilder = new ProcessBuilder("python3", "/home/one-x-shield/Desktop/telethon/API.py", "__get_all_members",groupId );
        processBuilder.redirectErrorStream(true);
        Process process = processBuilder.start();
        InputStream inputStream = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null) {
            data.add(line);
        }
        return data;

    }
    public synchronized static String kickMember(String groupId, String memberId) throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder("python3", "/home/one-x-shield/Desktop/telethon/API.py", "__kick_member",groupId, memberId );
        processBuilder.redirectErrorStream(true);

        Process process = processBuilder.start();

        InputStream inputStream = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        return  reader.readLine();

    }
    public static void main(String[] args) throws Exception {
        String  a = "-1002007387341";
        String aa = "ikskalibeur";
        getAllMembers(a.toString()).forEach( (member) -> {
            System.out.println(member.toCharArray());
        });
        String m = "1270401609";
        String mm = "Abidarmadrid";
        System.out.println(kickMember(aa, m));
        getAllMembers(a.toString()).forEach( (member) -> {
            System.out.println(member.toCharArray());
        });



    }
}
