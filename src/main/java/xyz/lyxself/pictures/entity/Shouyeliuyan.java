package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_shouyeliuyan") //映射的表名称
public class Shouyeliuyan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid")// @Column 绑定数据库中的列
            String id;
    @Column(name = "_id")
    String _id;
    @Column(name = "zanshu")
    String zanshu;
    @Column(name = "danci")
    String danci;
    @Column(name = "changkaody")
    String changkaody;
}
