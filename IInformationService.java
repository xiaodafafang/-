package cn.tedu.dimanage.information.service;

import cn.tedu.dimanage.pojo.dto.InformationDTO;
import cn.tedu.dimanage.pojo.vo.InformationSimpleVO;

import java.util.List;

public interface IInformationService {

    /**
     * 创建一个新的咨询
     * @param informationDTO
     */
    void addNew(InformationDTO informationDTO);

    /**
     * 查询管理咨询页面所有信息
     * @return
     */
    List<InformationSimpleVO> selectList();

    void deleteById(Long id);

    InformationSimpleVO selectById(Long id);

    void updateById(InformationDTO informationDTO);

    InformationSimpleVO selectByTitle(String title);


}
