package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_oneword") //映射的表名称
public class Oneword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column( name = "mid" ,length = 32)// @Column 绑定数据库中的列
    Integer mid;
    @Column(name = "oid")
    String _id;
    @Column(name = "danci")
    String danci;
    @Column(columnDefinition = "text" ,name = "lwdanci")
    String lwdanci;
    @Column(columnDefinition = "text",name = "ciyi")
    String ciyi;
    @Column(name = "UK")
    String UK;
    @Column(name = "US")
    String US;
    @Column(columnDefinition = "text",name = "xzwcs")
    String xzwcs;
    @Column(columnDefinition = "text",name = "ybgqs")
    String ybgqs;
    @Column(columnDefinition = "text",name = "xzjxs")
    String xzjxs;
    @Column(columnDefinition = "text",name = "fushu")
    String fushu;
    @Column(columnDefinition = "text",name = "gaokao")
    String gaokao;
    @Column(columnDefinition = "text",name = "kaoyan")
    String kaoyan;
    @Column(columnDefinition = "text",name = "liuji")
    String liuji;
    @Column(columnDefinition = "text",name = "siji")
    String siji;
    @Column(columnDefinition = "text",name = "liju")
    String liju;
    @Column(columnDefinition = "text",name = "lijufanyi")
    String lijufanyi;
     @Column(columnDefinition = "json",name = "zhangwo")
     String zhangwo;
    @Column(columnDefinition = "json",name = "readdc")
    String readdc;
    @Column(columnDefinition = "text",name = "cipin")
    String cipin;
    @Column(columnDefinition = "text",name = "gkcipin")
    String gkcipin;
    @Column(columnDefinition = "text",name = "ljcipin")
    String ljcipin;
    @Column(columnDefinition = "text",name = "sjcipin")
    String sjcipin;
    @Column(columnDefinition = "text",name = "xuhao")
    String xuhao;
    @Column(columnDefinition = "json",name = "wdreaddc")
    String wdreaddc;
    @Column(columnDefinition = "text",name = "zhuji")
    String zhuji;
    @Column(columnDefinition = "text",name = "shucibj")
    String shucibj;
    @Column(columnDefinition = "text",name = "jinyicibx")
    String jinyicibx;
    @Column(columnDefinition = "text",name = "tonggenci")
    String tonggenci;
    @Column(columnDefinition = "text",name = "tgc")
    String tgc;
    @Column(columnDefinition = "text",name = "tgci")
    String tgci;
    @Column(columnDefinition = "json",name = "cizu")
    String cizu;
    @Column(columnDefinition = "text",name = "tonggen")
    String tonggen;
    @Column(columnDefinition = "text",name = "tongyici")
    String tongyici;
    @Column(columnDefinition = "json",name = "zhentiliju")
    String zhentiliju;
    @Column(name = "kygpc2000sc")
    String kygpc2000sc;
    @Column(name = "kygpc2000xh")
    String kygpc2000xh;
    @Column(name = "kygpc3000xh")
    String kygpc3000xh;
    @Column(name = "kygpc600xh")
    String kygpc600xh;
    
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
    @Column( name = "kygpc3000sc")
    String  kygpc3000sc;
    
    @Column( name = "kydgzimusc")
    String  kydgzimusc;
    @Column( name = "kydgcipinsc")
    String   kydgcipinsc;
    @Column( name = "kydgcipinxh")
    String   kydgcipinxh;
}
