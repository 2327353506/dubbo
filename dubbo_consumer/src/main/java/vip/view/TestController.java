package vip.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AbbPurchaseService;
import util.ResponseMsg;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "test")
public class TestController {

    @Resource(name="abbPurchaseService")
    private AbbPurchaseService abbPurchaseService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseMsg findTest(){
        ResponseMsg msg = new ResponseMsg();
        try{
            msg.setData(abbPurchaseService.findAbbSaleOrder());
        }catch(Exception e){
            msg.setMsg(e.toString());
        }
        return msg;
    }




}
