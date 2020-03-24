package com.demo.mall.controller;

import com.demo.mall.entity.Notes;
import com.demo.mall.service.NotesService;
import com.demo.mall.util.Result;
import com.demo.mall.util.ReturnCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@RequestMapping("/statistics")
@Controller
public class StatisticsController {
    @Autowired
    NotesService notesService;

    @RequestMapping("")
    public String statistics(){
        return "statistics";
    }

    @RequestMapping("/queryTodayNotes")
    @ResponseBody
    public Result queryTodayNotes(){
        Notes param = new Notes();
        param.setCreateTime(new Date());
        List<Notes> list = notesService.queryList(param);
        return Result.successWithData(list);
    }
}
