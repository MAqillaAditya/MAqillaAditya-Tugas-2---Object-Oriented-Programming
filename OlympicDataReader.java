import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OlympicDataReader {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\user\\Documents\\Olympic games info.csv"; // Ganti dengan path file CSV Anda
        String line;
        String csvSplitBy = ",";

        List<OlympicData> olympicDataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Skip header line
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                // Pastikan untuk memeriksa panjang data agar tidak terjadi ArrayIndexOutOfBoundsException
                if (data.length >= 9) {
                    int year = Integer.parseInt(data[0]);
                    String city = data[1];
                    String sport = data[2];
                    String discipline = data[3];
                    String gender = data[4];
                    String event = data[5];
                    String medal = data[6];
                    String noc = data[7];
                    String country = data[8];

                    OlympicData olympicData = new OlympicData(year, city, sport, discipline, gender, event, medal, noc, country);
                    olympicDataList.add(olympicData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output salah satu data dari dataset
        if (!olympicDataList.isEmpty()) {
            OlympicData sampleData = olympicDataList.get(0); // Mengambil data pertama
            System.out.println(sampleData);
        } else {
            System.out.println("No data found.");
        }
    }
}