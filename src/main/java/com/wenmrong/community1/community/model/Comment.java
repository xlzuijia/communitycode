package com.wenmrong.community1.community.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("comment")
public class Comment extends Model<Comment> {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.ID
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    @TableField("id")
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.PARENT_ID
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.TYPE
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    @TableField("type")
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.COMMENTATOR
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    @TableField("commentator")
    private Long commentator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.GMT_CREATE
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    @TableField("gmt_create")
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.GMT_MODIFIED
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    @TableField("gmt_modified")
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.LIKE_COUNT
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    @TableField("like_count")
    private Long likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.CONTENT
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    @TableField("content")
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.COMMENT_COUNT
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    @TableField("comment_count")
    private Integer commentCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.ID
     *
     * @return the value of COMMENT.ID
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.ID
     *
     * @param id the value for COMMENT.ID
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.PARENT_ID
     *
     * @return the value of COMMENT.PARENT_ID
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.PARENT_ID
     *
     * @param parentId the value for COMMENT.PARENT_ID
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.TYPE
     *
     * @return the value of COMMENT.TYPE
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.TYPE
     *
     * @param type the value for COMMENT.TYPE
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.COMMENTATOR
     *
     * @return the value of COMMENT.COMMENTATOR
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public Long getCommentator() {
        return commentator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.COMMENTATOR
     *
     * @param commentator the value for COMMENT.COMMENTATOR
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public void setCommentator(Long commentator) {
        this.commentator = commentator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.GMT_CREATE
     *
     * @return the value of COMMENT.GMT_CREATE
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.GMT_CREATE
     *
     * @param gmtCreate the value for COMMENT.GMT_CREATE
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.GMT_MODIFIED
     *
     * @return the value of COMMENT.GMT_MODIFIED
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.GMT_MODIFIED
     *
     * @param gmtModified the value for COMMENT.GMT_MODIFIED
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.LIKE_COUNT
     *
     * @return the value of COMMENT.LIKE_COUNT
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public Long getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.LIKE_COUNT
     *
     * @param likeCount the value for COMMENT.LIKE_COUNT
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.CONTENT
     *
     * @return the value of COMMENT.CONTENT
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.CONTENT
     *
     * @param content the value for COMMENT.CONTENT
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.COMMENT_COUNT
     *
     * @return the value of COMMENT.COMMENT_COUNT
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.COMMENT_COUNT
     *
     * @param commentCount the value for COMMENT.COMMENT_COUNT
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }
}