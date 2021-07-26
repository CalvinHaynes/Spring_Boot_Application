package top.calvinhaynes.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import top.calvinhaynes.pojo.TableTest;
import top.calvinhaynes.utils.JsonResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: CalvinHaynes
 * Date: 2021-07-26
 * Time: 14:33
 */
@Repository
public class TableTestDaoImpl implements TableTestDao{

    //注入JDBC
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加
    @Override
    public int add(TableTest tableTest) {
        return jdbcTemplate.update("insert into spring_boot_test.table_test(id, name, level, create_time, delete_flag, extension) values(?, ?, ?, ?, ?, ?)",tableTest.getId(),tableTest.getName(),tableTest.getLevel(),tableTest.getCreate_time(),tableTest.getDelete_flag(),tableTest.getExtension());
    }

    //更新
    @Override
    public int update(TableTest tableTest) {
        return jdbcTemplate.update("update spring_boot_test.table_test set name=? ,level=? ,create_time=? ,delete_flag=? ,extension=? where id=?",tableTest.getName(),tableTest.getLevel(),tableTest.getCreate_time(),tableTest.getDelete_flag(),tableTest.getExtension(),tableTest.getId());
    }

    //删除
    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE from spring_boot_test.table_test where id=?",id);
    }

    //根据ID查询
    @Override
    public Object findTableById(int id) {
        List<TableTest> tableTest = jdbcTemplate.query("select * from spring_boot_test.table_test where id=?",new Object[]{id},new BeanPropertyRowMapper(TableTest.class));
        if(tableTest!=null && tableTest.size()>0){
            TableTest table = tableTest.get(0);
            return table;
        }else{
            return new JsonResult(0);
        }


    }
}
