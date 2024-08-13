CREATE TABLE `student`
(
    `id`         int         NOT NULL AUTO_INCREMENT,
    `teacher_id` int         NOT NULL,
    `name`       varchar(16) NOT NULL,
    `age`        tinyint     NOT NULL,
    `gender`     tinyint     NOT NULL,
    PRIMARY KEY (`id`)
);
insert into `student`(`teacher_id`, `name`, `age`, `gender`)
values (1,'小青',18,1),
(1,'小红',20,2),
(1,'小明',23,1),
(2,'小李',21,1),
(2,'小丽',19,2),
(2,'小刚',18,1),
(3,'小强',22,1),
(3,'小蓝',20,2),
(3,'小紫',20,1),
(4,'小粉',22,1),
(4,'小黄',20,2),
(5,'小绿',22,1),
(5,'小红',20,2),
(6,'小紫',22,1),
(6,'小蓝',20,2),
(7,'小紫',22,1),
(7,'小蓝',20,2),
(8,'小紫',22,1),
(8,'小蓝',20,2),
(9,'小紫',22,1),
(9,'小蓝',20,2),
(10,'小紫',22,1),
(10,'小蓝',20,2);
CREATE TABLE `teacher`
(
    `id`   int         NOT NULL AUTO_INCREMENT,
    `name` varchar(16) NOT NULL,
    `age`  tinyint     NOT NULL,
    `gender`     tinyint     NOT NULL,
    PRIMARY KEY (`id`)
);
insert into `teacher`(`name`, `age`, `gender`)
values ('王老师',35,1),
('李老师',30,2),
('张老师',28,1),
('董老师',30,2),
('陈老师',31,1),
('刘老师',34,2),
('黄老师',32,1),
('周老师',25,2),
('吴老师',32,1),
('冯老师',36,2),
('赵老师',33,1);