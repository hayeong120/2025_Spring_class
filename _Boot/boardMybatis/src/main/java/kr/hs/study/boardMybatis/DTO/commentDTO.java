package kr.hs.study.boardMybatis.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class commentDTO {
    private int id;
    private String commentWriter;
    private String commentContents;
    private LocalDateTime commentCreatedTime;
    private int boardId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentWriter() {
        return commentWriter;
    }

    public void setCommentWriter(String commentWriter) {
        this.commentWriter = commentWriter;
    }

    public String getCommentContents() {
        return commentContents;
    }

    public void setCommentContents(String commentContents) {
        this.commentContents = commentContents;
    }

    public LocalDateTime getCommentCreatedTime() {
        return commentCreatedTime;
    }

    public void setCommentCreatedTime(LocalDateTime commentCreatedTime) {
        this.commentCreatedTime = commentCreatedTime;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }
}
