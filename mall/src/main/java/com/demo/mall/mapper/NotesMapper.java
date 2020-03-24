package com.demo.mall.mapper;

import com.demo.mall.entity.Notes;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface NotesMapper {

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
