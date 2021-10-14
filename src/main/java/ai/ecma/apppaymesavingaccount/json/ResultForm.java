package ai.ecma.apppaymesavingaccount.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultForm {

    private Long id;

    @JsonProperty(value = "cancel_time")
    private Long cancelTime;

    @JsonProperty(value = "create_time")
    private Long createTime;

    @JsonProperty(value = "perform_time")
    private Long performTime;

    private Integer reason;

    private Integer state;

    private String transaction;

    //CREATE TRANACTION DA KETADI BIZDAN
    public ResultForm(Long createTime, Integer state, String transaction) {
        this.createTime = createTime;
        this.state = state;
        this.transaction = transaction;
    }

    public ResultForm(Long cancelTime, Long createTime, Long performTime, Integer reason, Integer state, String transaction) {
        this.cancelTime = cancelTime;
        this.createTime = createTime;
        this.performTime = performTime;
        this.reason = reason;
        this.state = state;
        this.transaction = transaction;
    }
}
