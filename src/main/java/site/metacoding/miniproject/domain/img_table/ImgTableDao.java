package site.metacoding.miniproject.domain.img_table;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ImgTableDao {
    public int insert(@Param("imgPath") String imgPath, @Param("imgName") String imgName);
}
