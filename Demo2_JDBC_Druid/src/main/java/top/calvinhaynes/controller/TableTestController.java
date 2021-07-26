package top.calvinhaynes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.calvinhaynes.pojo.TableTest;
import top.calvinhaynes.service.TableTestService;
import top.calvinhaynes.utils.JsonResult;

/**
 * Created with IntelliJ IDEA.
 * Description:Table 的 Controller
 * User: CalvinHaynes
 * Date: 2021-07-26
 * Time: 14:53
 */
@RestController
@RequestMapping("/table")
public class TableTestController {
    //注入Service
    @Autowired
    private TableTestService tableTestService;

    //新增表格信息接口
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public JsonResult postTable(@RequestParam(value = "id")int id,
                            @RequestParam(value = "name")String name,
                            @RequestParam(value = "level")int level,
                            @RequestParam(value = "create_time")String create_time,
                            @RequestParam(value = "delete_flag")int delete_flag,
                            @RequestParam(value = "extension")String extension){
        TableTest tableTest = new TableTest();
        tableTest.setId(id);
        tableTest.setName(name);
        tableTest.setLevel(level);
        tableTest.setCreate_time(create_time);
        tableTest.setDelete_flag(delete_flag);
        tableTest.setExtension(extension);

        int status = tableTestService.add(tableTest);

        if(status==1){
            return new JsonResult(status);
        }else {
            return new JsonResult(0);
        }
    }

    //更新表格信息接口
    @RequestMapping(value = "update/{id}",method = RequestMethod.PUT)
    public JsonResult updateTable(@PathVariable("id")int id,
                              @RequestParam(value = "name")String name,
                              @RequestParam(value = "level")int level,
                              @RequestParam(value = "create_time")String create_time,
                              @RequestParam(value = "delete_flag")int delete_flag,
                              @RequestParam(value = "extension")String extension){

        TableTest tableTest = new TableTest();
        tableTest.setName(name);
        tableTest.setLevel(level);
        tableTest.setCreate_time(create_time);
        tableTest.setDelete_flag(delete_flag);
        tableTest.setExtension(extension);
        tableTest.setId(id);

        int status = tableTestService.update(tableTest);

        if(status==1){
            return new JsonResult(status);
        }else {
            return new JsonResult(0);
        }
    }

    //删除
    @RequestMapping(value = "delete/{id}",method = RequestMethod.DELETE)
    public JsonResult deleteTableById(@PathVariable("id") int id){
        int status = tableTestService.delete(id);

        if(status==1){
            return new JsonResult(status);
        }else {
            return new JsonResult(0);
        }
    }

    //查询
    @RequestMapping(value = "query/{id}",method = RequestMethod.GET)
    public Object getTableById(@PathVariable("id") int id){
            return tableTestService.findTableById(id);
    }
}
