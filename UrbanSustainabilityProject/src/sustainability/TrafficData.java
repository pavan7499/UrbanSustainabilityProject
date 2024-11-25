package sustainability;


//TrafficData.java

public class TrafficData {
 private int trafficId;
 private String trafficStatus;
 private String timestamp;

 public TrafficData(int trafficId, String trafficStatus, String timestamp) {
     this.trafficId = trafficId;
     this.trafficStatus = trafficStatus;
     this.timestamp = timestamp;
 }

 public int getTrafficId() {
     return trafficId;
 }

 public void setTrafficId(int trafficId) {
     this.trafficId = trafficId;
 }

 public String getTrafficStatus() {
     return trafficStatus;
 }

 public void setTrafficStatus(String trafficStatus) {
     this.trafficStatus = trafficStatus;
 }

 public String getTimestamp() {
     return timestamp;
 }

 public void setTimestamp(String timestamp) {
     this.timestamp = timestamp;
 }
}
