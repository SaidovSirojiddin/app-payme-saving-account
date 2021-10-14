package ai.ecma.apppaymesavingaccount.json;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CheckPerformTransactionAllowResponse {

    //В объекте additional биллинг поставщика может возвращать дополнительную информацию
    // (баланс пользователя, данные о заказе).
    // Кроме того, добавляя объект additional, следует сообщить об этом техническому специалисту Payme Business.
    private AdditionalInfo additionalInfo;

    private Boolean allow = false;


}
