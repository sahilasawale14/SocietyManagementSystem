package model;

public class Visitor {

    private int id;
    private String name;
    private String phone;
    private String purpose;
    private String entryTime;
    private String exitTime;

    public Visitor() {
    }

    public Visitor(int id, String name, String phone, String purpose, String entryTime, String exitTime) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.purpose = purpose;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }
}