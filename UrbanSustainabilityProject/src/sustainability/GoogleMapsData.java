package sustainability;
//GoogleMapsData.java

public class GoogleMapsData {
 private int id;
 private String route;
 private String trafficStatus;
 private String timestamp;

 public GoogleMapsData(int id, String route, String trafficStatus, String timestamp) {
     this.id = id;
     this.route = route;
     this.trafficStatus = trafficStatus;
     this.timestamp = timestamp;
 }

 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getRoute() {
     return route;
 }

 public void setRoute(String route) {
     this.route = route;
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
