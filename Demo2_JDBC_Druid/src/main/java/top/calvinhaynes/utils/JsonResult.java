package top.calvinhaynes.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: CalvinHaynes
 * Date: 2021-07-26
 * Time: 23:34
 */
/*
    使用@RestController或@ResponseBody时，可直接返回该对象，
    Spring Boot默认使用Jackson会自动将该对象转换为json字符串
    如{"code": 0,"msg": "","data": [{}, {}]}
 */
public class JsonResult{

    private int status;

    public JsonResult() {
    }

    public JsonResult(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "status=" + status +
                '}';
    }
}

