package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_shouyexq") //映射的表名称
public class Shouyexq {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid" ,length = 32)// @Column 绑定数据库中的列
            Integer id;
    @Column(name = "_id")
    String _id;
    @Column(name = "zhubiaoti")
    String zhubiaoti;
    @Column(name = "tupian")
    String tupian;
    @Column(name = "zhengwen")
    String zhengwen;
}
