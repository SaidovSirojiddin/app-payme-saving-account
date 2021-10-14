package ai.ecma.apppaymesavingaccount.service;


import ai.ecma.apppaymesavingaccount.json.PaycomRequestForm;
import net.minidev.json.JSONObject;

public interface IPaycomService {

    JSONObject payWithPaycom(PaycomRequestForm requestForm, String auth);


}
