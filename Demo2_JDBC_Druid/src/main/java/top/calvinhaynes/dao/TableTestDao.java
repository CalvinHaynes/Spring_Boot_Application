package top.calvinhaynes.dao;

import top.calvinhaynes.pojo.TableTest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: CalvinHaynes
 * Date: 2021-07-26
 * Time: 14:32
 */
public interface TableTestDao {

    int add(TableTest tableTest);

    int update(TableTest tableTest);

    int delete(int id);

    Object findTableById(int id);

}
