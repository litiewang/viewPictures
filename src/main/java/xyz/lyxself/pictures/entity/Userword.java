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
            Integer mid;
    @Column(name = "oid")
    String _id;
    @Column(name = "zhuangtai")
    String zhuangtai;
    @Column(name = "openid")
    String openid;
    @Column(name = "danci")
    String danci;
    @Column(columnDefinition = "datetime",name = "time")
    String time;
    @Column(name = "daifuxi")
    Boolean daifuxi;
    @Column(name = "sc")
    Boolean sc;
    @Column(name = "yigg")
    Boolean yigg;
    @Column(name = "fuxi")
    String fuxi;
    @Column(name = "fxdate")
    String fxdate;
}
