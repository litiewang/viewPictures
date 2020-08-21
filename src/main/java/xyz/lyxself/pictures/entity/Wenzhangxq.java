package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_wenzhangxq") //映射的表名称
public class Wenzhangxq {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid" ,length = 32)// @Column 绑定数据库中的列
            Integer id;
    @Column(name = "leixing")
    String leixing;
    @Column(name = "name")
    String name;
    @Column(name = "zhubiaoti")
    String zhubiaoti;
    @Column(name = "fubiaoti")
    String fubiaoti;
    @Column(name = "duanluo")
    String duanluo;
    @Column(name = "yingwen")
    String yingwen;
    @Column(name = "fanyi")
    String fanyi;
    @Column(name = "tupian")
    String tupian;
    @Column(name = "musicname")
    String musicname;
    @Column(name = "poster")
    String poster;
    @Column(name = "src")
    String src;
    @Column(name = "srcbeifen")
    String srcbeifen;
    
    @Column(name = "author")
    String author;
    
}
