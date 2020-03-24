package com.demo.mall.service.Impl;

import com.demo.mall.entity.Notes;
import com.demo.mall.mapper.NotesMapper;
import com.demo.mall.service.NotesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NotesServiceImpl implements NotesService {
    @Resource
    NotesMapper notesMapper;

    Logger logger = LoggerFactory.getLogger(NotesServiceImpl.class);

    @Override
    public Notes getNotes(Notes num) {
        return notesMapper.getNotes(num);
    }

    @Override
    public int updateNotes(Notes num) {
        return notesMapper.updateNotes(num);
    }

    @Override
    public int insertNotes(Notes num) {
        return notesMapper.insertNotes(num);
    }

    @Override
    public int deleteNotes(Notes num) {
        return notesMapper.deleteNotes(num);
    }

    @Override
    public List<Notes> queryList(Notes num) {
        return notesMapper.queryList(num);
    }

    @Override
    public Notes getLastNotes(Notes num) {
        return notesMapper.getLastNotes(num);
    }
}
