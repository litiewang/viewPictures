package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_tuijiancd") //映射的表名称
public class Tuijiancd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid" ,length = 32)// @Column 绑定数据库中的列
            Integer mid;
    @Column(name = "oid")
    String _id;
    @Column(name = "danci")
    String danci;
    @Column(name = "zhubiaoti")
    String zhubiaoti;
    @Column(name = "name")
    String name;
}
