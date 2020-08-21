package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_ztliju") //映射的表名称
public class Ztliju {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid" ,length = 32)// @Column 绑定数据库中的列
            Integer id;
    @Column(name = "liju")
    String liju;
    @Column(name = "lijufy")
    String lijufy;
    @Column(name = "laiyuan")
    String laiyuan;
    @Column(name = "name")
    String name;
    @Column(name = "_openid")
    String _openid;
    @Column(name = "danci")
    String danci;
   
}
