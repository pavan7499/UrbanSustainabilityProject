package sustainability;

//EmergencyServices.java

public class EmergencyServices {
 private int serviceId;
 private String serviceName;
 private String contactNumber;

 public EmergencyServices(int serviceId, String serviceName, String contactNumber) {
     this.serviceId = serviceId;
     this.serviceName = serviceName;
     this.contactNumber = contactNumber;
 }

 public int getServiceId() {
     return serviceId;
 }

 public void setServiceId(int serviceId) {
     this.serviceId = serviceId;
 }

 public String getServiceName() {
     return serviceName;
 }

 public void setServiceName(String serviceName) {
     this.serviceName = serviceName;
 }

 public String getContactNumber() {
     return contactNumber;
 }

 public void setContactNumber(String contactNumber) {
     this.contactNumber = contactNumber;
 }
}
