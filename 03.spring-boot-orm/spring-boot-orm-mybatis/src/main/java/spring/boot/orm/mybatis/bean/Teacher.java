package spring.boot.orm.mybatis.bean;

import lombok.Data;

/**
 * @author dongyh
 * @since 2024-08-13 12:06:55
 */
@Data
public class Teacher {
    private Long id;
    private String name;
    private String age;
    private String gender;

}
