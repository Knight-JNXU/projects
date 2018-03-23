package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.feilong.json.jsonlib.JsonUtil;

import code.model.AccountModel;

/**
 * @author knightjxnu
 * @version 1.0
 * @date 2018年2月20日
 * @function : 
 */
public class ModelTest extends BaseJUnit4SpringContextTests{
    
    
    /** The Constant log. */
    private static final Logger LOGGER = LoggerFactory.getLogger(ModelTest.class);
    
    @Autowired
    private AccountModel accountModel;
    
    
    /**
    * TestModelTest.
    */
    @Test
    public void testModelTest(){
        if (LOGGER.isInfoEnabled()){
            LOGGER.info("accountModel:{}", JsonUtil.format(accountModel));
        }
    }
    
}
