package com.demo.mall.service;

import com.demo.mall.entity.Notes;

import java.util.List;

public interface NotesService {
    Notes getNotes(Notes num);

    /**
     * 获取当天最后一条记录
     * @param num
     * @return
     */
    Notes getLastNotes(Notes num);

    /**
     * 更新账户信息
     * @param num
     * @return
     */
    int updateNotes(Notes num);

    /**
     * 新建账户
     * @param num
     * @return
     */
    int insertNotes(Notes num);

    /**
     * 删除账户
     * @param num
     * @return
     */
    int deleteNotes(Notes num);

    List<Notes> queryList(Notes num);
}
