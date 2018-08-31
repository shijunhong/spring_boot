package girl.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: shijunhong
 * Date: 2018/8/31
 * Time: 下午6:23
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository repository;

    @Transactional
    public void insertTwo(){
        Girl girl = new Girl();
        girl.setCupSize("b");
        girl.setAge(20);
        repository.save(girl);


        int a =0;
        int b = a/a;

        Girl girl2 = new Girl();
        girl2.setCupSize("ddddd");
        girl2.setAge(29);
        repository.save(girl2);
    }
}
