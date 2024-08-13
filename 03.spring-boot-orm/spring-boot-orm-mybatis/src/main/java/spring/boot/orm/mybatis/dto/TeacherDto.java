package spring.boot.orm.mybatis.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import spring.boot.orm.mybatis.bean.Student;
import spring.boot.orm.mybatis.bean.Teacher;

import java.util.List;

/**
 * @author dongyh
 * @since 2024-08-13 12:21:08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TeacherDto extends Teacher {
    private List<Student> studentList;
    private Student student;
}
