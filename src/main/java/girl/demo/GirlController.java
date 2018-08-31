package girl.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * User: shijunhong
 * Date: 2018/8/31
 * Time: 下午5:22
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository repository;

    @Autowired
    private GirlService girlService;
    //查询女生列表
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return repository.findAll();
    }

    //新增一个女生
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return repository.save(girl);
    }
    //查询一个女生
    @GetMapping(value = "/girls/{id}")
    public Optional<Girl> girlFindOne(@PathVariable("id") Integer id){
        return repository.findById(id);
    }
    //修改一个女生
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdata(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return repository.save(girl);

    }
    //删除一个女生
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    //通过年龄查询
    @GetMapping(value = "/girls/age")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return repository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public void girlTwo(){
        girlService.insertTwo();
    }
}
