package models;

import java.util.Map;

public class MeetingData {

    private String name;
    private String type;
    private String number;
    private String startDate;
    private String endDate;
    private String location;
    private String unit;
    private String organizedBy;
    private String reporter;
    private String attendee;

    public MeetingData(String name, String type, String number, String startDate, String endDate, String location, String unit, String organizedBy, String reporter, String attendee) {
        this.name = name;
        this.type = type;
        this.number = number;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.unit = unit;
        this.organizedBy = organizedBy;
        this.reporter = reporter;
        this.attendee = attendee;
    }

    public MeetingData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getOrganizedBy() {
        return organizedBy;
    }

    public void setOrganizedBy(String organizedBy) {
        this.organizedBy = organizedBy;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getAttendee() {
        return attendee;
    }

    public void setAttendee(String attendee) {
        this.attendee = attendee;
    }

    public static MeetingData createMeetingData(Map<String, String> data){
        MeetingData meetingData = new MeetingData();
        meetingData.setName(data.get("name"));
        meetingData.setType(data.get("type"));
        meetingData.setNumber(data.get("number"));
        meetingData.setStartDate(data.get("startDate"));
        meetingData.setEndDate(data.get("endDate"));
        meetingData.setLocation(data.get("location"));
        meetingData.setUnit(data.get("organizedBy"));
        meetingData.setReporter(data.get("reporter"));
        meetingData.setAttendee(data.get("attendee"));
        return meetingData;
    }

}

