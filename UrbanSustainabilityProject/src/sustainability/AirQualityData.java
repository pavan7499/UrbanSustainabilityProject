package sustainability;

//AirQualityData.java

public class AirQualityData {
 private int id;
 private int aqi;
 private String location;
 private String timestamp;

 public AirQualityData(int id, int aqi, String location, String timestamp) {
     this.id = id;
     this.aqi = aqi;
     this.location = location;
     this.timestamp = timestamp;
 }

 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public int getAqi() {
     return aqi;
 }

 public void setAqi(int aqi) {
     this.aqi = aqi;
 }

 public String getLocation() {
     return location;
 }

 public void setLocation(String location) {
     this.location = location;
 }

 public String getTimestamp() {
     return timestamp;
 }

 public void setTimestamp(String timestamp) {
     this.timestamp = timestamp;
 }
}
