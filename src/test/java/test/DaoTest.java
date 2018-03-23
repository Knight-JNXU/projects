package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.feilong.json.jsonlib.JsonUtil;

import code.dao.AccountDao;
import code.model.AccountModel;

/**
 * @author knightjxnu
 * @version 1.0
 * @date 2018年2月20日
 * @function : 
 */
public class DaoTest extends BaseJUnit4SpringContextTests{
    
    
    /** The Constant log. */
    private static final Logger LOGGER = LoggerFactory.getLogger(DaoTest.class);
    
    @Autowired
    private AccountDao accountDao;
    
    @Autowired
    private AccountModel accountModel;
    
    
    /**
    * TestModelTest.
    */
    @Test
    public void insertModelTest(){
        int insert = accountDao.insert(accountModel);
        if (LOGGER.isInfoEnabled()){
            LOGGER.info("insert:"+insert);
        }
    }
    
    
    

    /**
    * TestDaoTest.
    */
    @Test
    public void selectDaoTest(){
        List<Integer> selectAccountIdByName = accountDao.selectAccountIdByName("knight");
        if (LOGGER.isInfoEnabled()){
            LOGGER.info("select:"+selectAccountIdByName);
        }
    }
    
}
