package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_wenzhanglist") //映射的表名称
public class Wenzhanglist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid" ,length = 32)// @Column 绑定数据库中的列
            Integer mid;
    @Column(name = "oid")
    String _id;
    @Column(name = "name")
    String name;
    @Column(name = "zhuangtai")
    String zhuangtai;
    @Column(name = "dancishu")
    String dancishu;
    @Column(name = "zhubiaoti")
    String zhubiaoti;
    @Column(name = "fubiaoti")
    String fubiaoti;
    @Column(name = "yuedu")
    String yuedu;
    @Column(name = "fenlei")
    String fenlei;
    @Column(name = "laiyuan")
    String laiyuan;
    @Column(name = "beizhu")
    String beizhu;
    @Column(name = "kycishu")
    String kycishu;
    @Column(name = "ljcishu")
    String ljcishu;
    @Column(name = "sjcishu")
    String sjcishu;
    
    @Column(name = "gkcishu")
    String gkcishu;
    @Column(name = "tubiao")
    String tubiao;
    @Column(name = "shouye")
    String shouye;
    @Column(name = "jiancha")
    String jiancha;
    
    @Column(name = "zhongchuan")
    String 重传;
    @Column(name = "quanzhong")
    String quanzhong;
    @Column(name = "tiaozhuan")
    String tiaozhuan;
    @Column(name = "kthuiyuan")
    String kthuiyuan;
    @Column(name = "jhtishi")
    String jhtishi;
    @Column(name = "huiyuan")
    String huiyuan;
    @Column(name = "jihuots")
    String jihuots;
    @Column(name = "hot")
    String hot;
    @Column(name = "shouyetb")
    String shouyetb;
    
}
