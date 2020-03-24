package com.demo.mall.controller;

import com.demo.mall.entity.Notes;
import com.demo.mall.service.NotesService;
import com.demo.mall.util.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Api(tags = "商品下单测试接口")
@Controller
public class indexController {
    @Autowired
    NotesService notesService;
/*
    @Autowired
    ShoppingService shoppingService;

    @RequestMapping("/order")
    @ApiOperation(value = "商品下单", notes = "根据商品编码和账户userid下单", httpMethod = "POST")
    @ApiImplicitParams({@ApiImplicitParam(name = "commodityCode", value = "商品编码", required = true, dataType = "string"),
            @ApiImplicitParam(name = "count", value = "下单商品数量", required = true, dataType = "int"),
            @ApiImplicitParam(name = "money", value = "订单金额", required = true, dataType = "float"),
            @ApiImplicitParam(name = "userId", value = "账户userid", required = true, dataType = "string")})
    public Result oder(String commodityCode, int count, float money, String userId){
        shoppingService.order(commodityCode, count, money, userId);
        return Result.success();
    }
*/

    @RequestMapping("")
    public String notes(Model model){
        Notes param = new Notes();
        param.setType(1);
        param.setCreateTime(new Date());
        List<Notes> peopleList = notesService.queryList(param);
        param.setType(2);
        List<Notes> carList = notesService.queryList(param);
        param.setType(3);
        List<Notes> backList = notesService.queryList(param);
        param.setType(4);
        List<Notes> kuaidiList = notesService.queryList(param);
        param.setType(5);
        List<Notes> tuangouList = notesService.queryList(param);
        model.addAttribute("peopleCount", peopleList.size());
        model.addAttribute("carCount", carList.size());
        model.addAttribute("backCount", backList.size());
        model.addAttribute("kuaidiCount", kuaidiList.size());
        model.addAttribute("tuangouCount", tuangouList.size());
        return "notes";
    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(Model model, @RequestParam(name = "type") Integer type){
        Notes note = new Notes();
        note.setId(UUID.randomUUID().toString().replace("-", ""));
        note.setType(type);
        note.setCreateTime(new Date());
        notesService.insertNotes(note);

        List<Notes> list = notesService.queryList(note);
        return Result.successWithData(list.size());
    }

    @RequestMapping("/subtract")
    @ResponseBody
    public Result subtract(Model model, @RequestParam(name = "type") Integer type){
        Notes note = new Notes();
        note.setType(type);
        note.setCreateTime(new Date());
        Notes lastNote =  notesService.getLastNotes(note);
        notesService.deleteNotes(lastNote);

        List<Notes> list = notesService.queryList(note);
        return Result.successWithData(list.size());
    }
}
