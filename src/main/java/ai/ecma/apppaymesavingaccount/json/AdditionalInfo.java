package ai.ecma.apppaymesavingaccount.json;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdditionalInfo {

    private String phoneNumber;

    private String site = "pdp.uz";

    public AdditionalInfo(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
