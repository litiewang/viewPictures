package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_shouyeliuyan") //映射的表名称
public class Shouyeliuyan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid" ,length = 32)// @Column 绑定数据库中的列
        Integer mid;
    @Column(name = "oid")
    String _id;
    @Column(columnDefinition = "text",name = "zanid")
    String zanid;
    @Column(name = "nickname")
    String nickname;
    @Column(columnDefinition = "datetime",name = "logdate")
    String logdate;
    @Column(columnDefinition = "text",name = "liuyan")
    String liuyan;
    @Column(name = "xianshi")
    Boolean xianshi;
    @Column(name = "paixu")
    String paixu;
    @Column(columnDefinition = "text",name = "huifu")
    String huifu;
    @Column(name = "openid")
    String openid;
    @Column(name = "ima")
    String ima;
    
    @Column(name = "zanshu")
    String zanshu;
}
