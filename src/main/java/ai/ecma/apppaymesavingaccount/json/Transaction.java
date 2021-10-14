package ai.ecma.apppaymesavingaccount.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    private String id;

    private Account account;

    private Integer amount;

    @JsonProperty(value = "cancel_time")
    private Long cancelTime;

    @JsonProperty(value = "create_time")
    private Long createTime;

    @JsonProperty(value = "perform_time")
    private Long performTime;

    private Integer reason;

    private Integer state;

    private Long time;

    private String transaction;
}
