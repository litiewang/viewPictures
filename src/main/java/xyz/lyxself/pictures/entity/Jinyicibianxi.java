package xyz.lyxself.pictures.entity;

import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "t_jinyicibianxi") //映射的表名称
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class Jinyicibianxi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
    @Column(name = "mid")// @Column 绑定数据库中的列
            String id;
    @Column(name = "_id")
    String _id;
    @Column(name = "danci")
    String danci;
    @Type(type = "json")
    @Column(columnDefinition = "json" )
    private List<Jinyicibx> jinyicibx;
    @Column(name = "_openid")
    String _openid;


    @Data
    public class Jinyicibx{
        @Column(name = "dancizu")
        String dancizu;
        @Column(name = "danci")
        String danci;
        @Column(name = "bianxi")
        String bianxi;
    }
}
