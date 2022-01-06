package models;

import java.util.Map;

public class BusinessUnitData {

    private String name;

    private String parentUnit;

    public BusinessUnitData(String name, String parentUnit) {
        this.name = name;
        this.parentUnit = parentUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentUnit() {
        return parentUnit;
    }

    public void setParentUnit(String parentUnit) {
        this.parentUnit = parentUnit;
    }

    public static BusinessUnitData createBusinessUnitData(Map<String, String> entry){
        BusinessUnitData businessUnitData = new BusinessUnitData(
            entry.get("name"), entry.get("parentUnit")
        );
        return businessUnitData;
    }
}
