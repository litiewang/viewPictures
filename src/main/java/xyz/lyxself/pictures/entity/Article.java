package xyz.lyxself.pictures.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Entity // 注明此Java类是实体类
@Data // 自动生成getter和setter
@Table(name = "tb_article") // 数据库中表的名称
public class Article {
	@Id // 数据库组件
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
	@Column(name = "mid")// @Column 绑定数据库中的列
	private Long mid;
	@Column(name = "header")
	private String header;
	@Column(name = "publishtime")
	private Date publishtime;
	@Column(name = "photo")
	private String photo;
	@Column(name = "content")
	private String content;
}
