package com.entity.vo;

import com.entity.KechengPingfenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课程评价
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kecheng_pingfen")
public class KechengPingfenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "xuesheng_id")
    private Integer xueshengId;


    /**
     * 课程
     */

    @TableField(value = "kecheng_id")
    private Integer kechengId;


    /**
     * 评分
     */

    @TableField(value = "kecheng_pingfen_pingfen")
    private Double kechengPingfenPingfen;


    /**
     * 评价内容
     */

    @TableField(value = "kecheng_pingfen_content")
    private String kechengPingfenContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 获取：课程
	 */

    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 设置：评分
	 */
    public Double getKechengPingfenPingfen() {
        return kechengPingfenPingfen;
    }


    /**
	 * 获取：评分
	 */

    public void setKechengPingfenPingfen(Double kechengPingfenPingfen) {
        this.kechengPingfenPingfen = kechengPingfenPingfen;
    }
    /**
	 * 设置：评价内容
	 */
    public String getKechengPingfenContent() {
        return kechengPingfenContent;
    }


    /**
	 * 获取：评价内容
	 */

    public void setKechengPingfenContent(String kechengPingfenContent) {
        this.kechengPingfenContent = kechengPingfenContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
