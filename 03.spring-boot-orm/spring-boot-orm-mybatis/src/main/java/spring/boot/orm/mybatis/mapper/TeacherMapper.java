package spring.boot.orm.mybatis.mapper;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import spring.boot.orm.mybatis.dto.TeacherDto;

import java.util.List;

/**
 * @author dongyh
 * @since 2024-08-13 12:06:13
 */
@Mapper
public interface TeacherMapper {
    TeacherDto oneToOne(@Param("teacherId")Long teacherId,@Param("studentId")Long studentId);
    List<TeacherDto> oneToMany();
    Page<TeacherDto> pageOneToMany();
}
