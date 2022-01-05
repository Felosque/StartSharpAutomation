package config;

import java.util.Locale;
import java.util.Map;
import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;
import models.BusinessUnitData;
import models.MeetingData;

public class Configurer implements TypeRegistryConfigurer {
    @Override
    public void configureTypeRegistry(TypeRegistry registry) {
        registry.defineDataTableType(new DataTableType(BusinessUnitData.class, new TableEntryTransformer<BusinessUnitData>() {
            @Override
            public BusinessUnitData transform(Map<String, String> entry) {
                return BusinessUnitData.createBusinessUnitData(entry);
            }
        }));
        registry.defineDataTableType(new DataTableType(MeetingData.class, new TableEntryTransformer<MeetingData>() {
            @Override
            public MeetingData transform(Map<String, String> entry) throws Throwable {
                return MeetingData.createMeetingData(entry);
            }
        }));
    }

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

}
