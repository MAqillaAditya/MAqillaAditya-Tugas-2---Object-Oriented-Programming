import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OlympicDataReader {
    public static void main(String[] args) {
        String csvFile = "games-info.csv"; // Replace with your CSV file path
        String line;
        String csvSplitBy = ",";

        List<OlympicData> olympicDataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Skip header line
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                // Ensure to check the length of data to avoid ArrayIndexOutOfBoundsException
                if (data.length >= 9) {
                    // Extract year from the first column and trim quotes
                    String[] yearAndSeason = data[0].split(" ");
                    int year = Integer.parseInt(yearAndSeason[0].replace("\"", "").trim()); // Remove quotes and trim spaces

                    String city = data[1].replace("\"", "").trim(); // Remove quotes and trim spaces
                    String sport = data[2].replace("\"", "").trim(); // Remove quotes and trim spaces
                    String discipline = data[3].replace("\"", "").trim(); // Remove quotes and trim spaces
                    String gender = data[4].replace("\"", "").trim(); // Remove quotes and trim spaces
                    String event = data[5].replace("\"", "").trim(); // Remove quotes and trim spaces
                    String medal = data[6].replace("\"", "").trim(); // Remove quotes and trim spaces
                    String noc = data[7].replace("\"", "").trim(); // Remove quotes and trim spaces
                    String country = data[8].replace("\"", "").trim(); // Remove quotes and trim spaces

                    OlympicData olympicData = new OlympicData(year, city, sport, discipline, gender, event, medal, noc, country);
                    olympicDataList.add(olympicData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output all data from the dataset
        if (!olympicDataList.isEmpty()) {
            for (OlympicData olympicData : olympicDataList) {
                System.out.println(olympicData);
            }
        } else {
            System.out.println("No data found.");
        }
    }
}