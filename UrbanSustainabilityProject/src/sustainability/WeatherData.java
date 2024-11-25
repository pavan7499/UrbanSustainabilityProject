package sustainability;
//WeatherData.java

public class WeatherData {
 private int id;
 private String weatherCondition;
 private String timestamp;

 public WeatherData(int id, String weatherCondition, String timestamp) {
     this.id = id;
     this.weatherCondition = weatherCondition;
     this.timestamp = timestamp;
 }

 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getWeatherCondition() {
     return weatherCondition;
 }

 public void setWeatherCondition(String weatherCondition) {
     this.weatherCondition = weatherCondition;
 }

 public String getTimestamp() {
     return timestamp;
 }

 public void setTimestamp(String timestamp) {
     this.timestamp = timestamp;
 }
}
