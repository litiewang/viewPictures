package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_huiyuan") //映射的表名称
public class Huiyuan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid")// @Column 绑定数据库中的列
            String id;
    @Column(name = "_id")
    String _id;
    @Column(name = "openid")
    String openid;
    @Column(name = "leixing")
    String leixing;
    @Column(name = "jiezhiriqi")
    String jiezhiriqi;
    @Column(name = "jiezhishijian")
    String jiezhishijian;
    @Column(name = "daoqishijian")
    String daoqishijian;
 
}
