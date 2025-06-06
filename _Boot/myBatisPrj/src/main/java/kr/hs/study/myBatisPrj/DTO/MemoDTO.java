package kr.hs.study.myBatisPrj.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemoDTO {
    private int idx;
    private String writer;
    private String memo;
    private LocalDateTime post_date;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public LocalDateTime getPost_date() {
        return post_date;
    }

    public void setPost_date(LocalDateTime post_date) {
        this.post_date = post_date;
    }
}
