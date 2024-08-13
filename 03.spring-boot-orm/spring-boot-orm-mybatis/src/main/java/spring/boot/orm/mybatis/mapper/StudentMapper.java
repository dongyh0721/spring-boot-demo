package spring.boot.orm.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import spring.boot.orm.mybatis.bean.Student;

/**
 * @author dongyh
 * @since 2024-08-13 12:05:26
 */
@Mapper
public interface StudentMapper {
    int insert(Student student);
    int updateById(Student student);
    Student selectById(Long id);
    int deleteById(Long id);
}
