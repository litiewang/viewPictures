package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_lurudata") //映射的表名称
public class Lurudata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid" ,length = 32)// @Column 绑定数据库中的列
            Integer id;
    @Column(name = "_id")
    String _id;
    @Column(name = "_openid")
    String _openid;
    @Column(name = "zanid")
    String zanid;
    @Column(name = "nickname")
    String nickname;
    @Column(name = "logdate")
    String logdate;
    @Column(name = "liuyan")
    String liuyan;
    @Column(name = "xianshi")
    Boolean xianshi;
    @Column(name = "paixu")
    String paixu;
    @Column(name = "huifu")
    String huifu;
    @Column(name = "openid")
    String openid;
    @Column(name = "ima")
    String ima;
}
