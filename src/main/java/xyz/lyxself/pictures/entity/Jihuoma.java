package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_jihuoma") //映射的表名称
public class Jihuoma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid")// @Column 绑定数据库中的列
            String id;
    @Column(name = "_id")
    String _id;
    @Column(name = "jihuoma")
    String jihuoma;
    @Column(name = "youxiaoqi")
    String youxiaoqi;
    @Column(name = "shiyongguo")
    Boolean shiyongguo;
    @Column(name = "leixing")
    String leixing;
}
