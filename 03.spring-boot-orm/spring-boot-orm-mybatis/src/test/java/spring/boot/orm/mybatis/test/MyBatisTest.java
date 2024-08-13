package spring.boot.orm.mybatis.test;

import com.github.pagehelper.PageHelper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import spring.boot.orm.mybatis.MyBatisApplication;
import spring.boot.orm.mybatis.bean.Student;
import spring.boot.orm.mybatis.mapper.StudentMapper;
import spring.boot.orm.mybatis.mapper.TeacherMapper;

/**
 * @author dongyh
 * @since 2024-08-13 12:10:37
 */
@Slf4j
@SpringBootTest(classes = MyBatisApplication.class)
public class MyBatisTest {
    @Resource
    private StudentMapper studentMapper;
    @Resource
    private TeacherMapper teacherMapper;
    @Test
    public void studentInsert(){
        Student student = new Student();
        student.setName("小绿");
        student.setAge(26);
        student.setGender(2);
        student.setTeacherId(1L);
        log.info("插入数量:{}",studentMapper.insert(student));
        log.info("插入对象:{}",student);
    }
    @Test
    public void studentUpdate(){
        Student student = studentMapper.selectById(1L);
        log.info("更新前数据:{}",student);
        student.setName("小红");
        student.setAge(27);
        log.info("更新数量:{}",studentMapper.updateById(student));
        log.info("更新后数据:{}",student);
    }
    @Test
    public void studentSelectById(){
        log.info("查询结果:{}",studentMapper.selectById(1L));
    }
    @Test
    public void studentDeleteById(){
        log.info("删除数量:{}",studentMapper.deleteById(1L));
    }
    @Test
    public void teacherOneToOne(){
        log.info("查询结果:{}",teacherMapper.oneToOne(1L,1L));
    }
    @Test
    public void teacherOneToMany(){
        PageHelper.startPage(1,5);
        log.info("查询结果:{}",teacherMapper.pageOneToMany());
    }
}
