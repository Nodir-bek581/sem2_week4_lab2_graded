

public class Sensor {
    private String location;
    private double reading;

    public void setReading(double reading1) {
        this.reading = reading1;
    }

    public double getReading() {return reading;}

    public Sensor() {
        if(reading>50.0 || reading<-50.0) this.reading = 0.0;
        else location = "Unknown";
    }

    public void setLocation(String location1) {
        this.location = location1;
    }

    public String getLocation() {return location;}



}
