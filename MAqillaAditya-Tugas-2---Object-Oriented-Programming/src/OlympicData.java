// OlympicData.java
public class OlympicData {
    private int year;
    private String city;
    private String sport;
    private String discipline;
    private String gender;
    private String event;
    private String medal;
    private String noc;
    private String country;

    // Constructor
    public OlympicData(int year, String city, String sport, String discipline, String gender, String event, String medal, String noc, String country) {
        this.year = year;
        this.city = city;
        this.sport = sport;
        this.discipline = discipline;
        this.gender = gender;
        this.event = event;
        this.medal = medal;
        this.noc = noc;
        this.country = country;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    public String getSport() {
        return sport;
    }

    public String getDiscipline() {
        return discipline;
    }

    public String getGender() {
        return gender;
    }

    public String getEvent() {
        return event;
    }

    public String getMedal() {
        return medal;
    }

    public String getNoc() {
        return noc;
    }

    public String getCountry() {
        return country;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "OlympicData{" +
                "year=" + year +
                ", city='" + city + '\'' +
                ", sport='" + sport + '\'' +
                ", discipline='" + discipline + '\'' +
                ", gender='" + gender + '\'' +
                ", event='" + event + '\'' +
                ", medal='" + medal + '\'' +
                ", noc='" + noc + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}