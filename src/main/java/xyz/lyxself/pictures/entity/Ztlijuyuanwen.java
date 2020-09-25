package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_ztlijuyuanwen") //映射的表名称
public class Ztlijuyuanwen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid" ,length = 32)// @Column 绑定数据库中的列
    Integer mid;
    @Column(name = "oid")
    String _id;
    @Column(name = "laiyuan")
    String laiyuan;
    @Column(name = "liju")
    String liju;
    @Column(name = "lijufy")
    String lijufy;
    @Column(name = "leixing")
    String leixing;
    @Column(name = "name")
    String name;
   
}
