package top.calvinhaynes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.calvinhaynes.dao.TableTestDao;
import top.calvinhaynes.pojo.TableTest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: CalvinHaynes
 * Date: 2021-07-26
 * Time: 14:51
 */
@Service
public class TableTestServiceImpl implements TableTestService{

    @Autowired
    private TableTestDao tableTestDao;

    @Override
    public int add(TableTest tableTest) {
        return tableTestDao.add(tableTest);
    }

    @Override
    public int update(TableTest tableTest) {
        return tableTestDao.update(tableTest);
    }

    @Override
    public int delete(int id) {
        return tableTestDao.delete(id);
    }

    @Override
    public Object findTableById(int id) {
        return tableTestDao.findTableById(id);
    }
}
