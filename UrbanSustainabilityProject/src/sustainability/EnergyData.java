package sustainability;

//EnergyData.java

public class EnergyData {
 private int id;
 private double energyConsumption;
 private String timestamp;

 public EnergyData(int id, double energyConsumption, String timestamp) {
     this.id = id;
     this.energyConsumption = energyConsumption;
     this.timestamp = timestamp;
 }

 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public double getEnergyConsumption() {
     return energyConsumption;
 }

 public void setEnergyConsumption(double energyConsumption) {
     this.energyConsumption = energyConsumption;
 }

 public String getTimestamp() {
     return timestamp;
 }

 public void setTimestamp(String timestamp) {
     this.timestamp = timestamp;
 }
}
