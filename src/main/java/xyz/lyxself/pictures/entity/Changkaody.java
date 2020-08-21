package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_changkaody") //映射的表名称
public class Changkaody {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid" ,length = 32)// @Column 绑定数据库中的列
    String _id;
    @Column(name = "changkaodyfy")
    String changkaodyfy;
    @Column(name = "danci")
    String danci;
    @Column(name = "changkaody")
    String changkaody;
    @Column(name = "liju")
    String liju;
    @Column(name = "lijufy")
    String lijufy;

}
