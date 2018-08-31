package girl.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: shijunhong
 * Date: 2018/8/31
 * Time: 下午4:03
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@RequestMapping("/hello")
public class helloController {
    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = {"/say"},method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = true,defaultValue = "0") Integer id){
        return "id: "+id;
    }
}
