package spring.boot.orm.mybatis.bean;

import lombok.Data;

/**
 * @author dongyh
 * @since 2024-08-13 12:06:42
 */
@Data
public class Student {
    private Long id;
    private Long teacherId;
    private String name;
    private Integer gender;
    private Integer age;
}
