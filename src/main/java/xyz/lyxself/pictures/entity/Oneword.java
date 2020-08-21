package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_oneword") //映射的表名称
public class Oneword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid" ,length = 32)// @Column 绑定数据库中的列
    Integer id;
    @Column(name = "_id")
    String _id;
    @Column(name = "danci")
    String danci;
    @Column(name = "lwdanci")
    String lwdanci;
    @Column(name = "ciyi")
    String ciyi;
    @Column(name = "UK")
    String UK;
    @Column(name = "US")
    String US;
    @Column(name = "xzwcs")
    String xzwcs;
    @Column(name = "ybgqs")
    String ybgqs;
    @Column(name = "xzjxs")
    String xzjxs;
    @Column(name = "fushu")
    String fushu;
    @Column(name = "gaokao")
    String gaokao;
    @Column(name = "kaoyan")
    String kaoyan;
    @Column(name = "liuji")
    String liuji;
    @Column(name = "siji")
    String siji;
    @Column(name = "liju")
    String liju;
    @Column(name = "lijufanyi")
    String lijufanyi;
    @Column(name = "zhangwo",length = 2550)
    String zhangwo;
    @Column(name = "readdc")
    String readdc;
    @Column(name = "cipin")
    String cipin;
    @Column(name = "gkcipin")
    String gkcipin;
    @Column(name = "ljcipin")
    String ljcipin;
    @Column(name = "sjcipin")
    String sjcipin;
    @Column(name = "xuhao")
    String xuhao;
    @Column(name = "wdreaddc",length = 2250)
    String wdreaddc;
    @Column(name = "zhuji")
    String zhuji;
    @Column(name = "shucibj")
    String shucibj;
    @Column(name = "jinyicibx")
    String jinyicibx;
    @Column(name = "tonggenci")
    String tonggenci;
    @Column(name = "tgc")
    String tgc;
    @Column(name = "tgci")
    String tgci;
    @Column(name = "cizu")
    String cizu;
    @Column(name = "tonggen")
    String tonggen;
    @Column(name = "tongyici")
    String tongyici;
    @Column(name = "zhentiliju")
    String zhentiliju;
    @Column(name = "kygpc2000sc")
    String kygpc2000sc;
    @Column(name = "kygpc2000xh")
    String kygpc2000xh;
    @Column(name = "kygpc3000xh")
    String kygpc3000xh;
    @Column(name = "kygpc600xh")
    String kygpc600xh;
    @Column(name = "kydgcipinxh")
    String kydgcipinxh;
    @Column(name = "kydgzimuxh")
    String kydgzimuxh;
    @Column(name = "kygpc2000")
    String kygpc2000;
    @Column(name = "kygpc3000")
    String kygpc3000;
    @Column(name = "kygpc600")
    String kygpc600;
    @Column(name = "kygpc600sc")
    String kygpc600sc;
    @Column(name = "undefined")
    String undefined;


}
