package commons;

import java.io.BufferedReader;
import java.io.FileReader;

public class ApiConfig {

    public final String base_uri = "https://craftplacer.trexion.com";

    public String read(String filePath){
        String finalText = null;
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            finalText = sb.toString();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return finalText;
    }
}
