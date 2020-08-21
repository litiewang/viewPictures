package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_userword") //映射的表名称
public class Userword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid" ,length = 32)// @Column 绑定数据库中的列
            Integer id;
    @Column(name = "_id")
    String _id;
    @Column(name = "zhuangtai")
    String zhuangtai;
    @Column(name = "_openid")
    String _openid;
    @Column(name = "openid")
    String openid;
    @Column(name = "danci")
    String danci;
}
