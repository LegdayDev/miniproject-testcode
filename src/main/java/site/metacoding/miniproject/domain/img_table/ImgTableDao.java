package site.metacoding.miniproject.domain.img_table;

public interface ImgTableDao {
    public int insert(ImgTable imgTable);

    public String findByImg(String str);
}
