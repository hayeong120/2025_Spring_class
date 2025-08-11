package kr.hs.study.firstJPA.DTO;

import kr.hs.study.firstJPA.entity.memoEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class memoDTO {
    private Long id;
    private String title;
    private String content;

    // dto -> entity
    public static memoEntity toEntity(memoDTO memoDTO) {
        return memoEntity.builder()
                .id(memoDTO.getId())
                .title(memoDTO.getTitle())
                .content(memoDTO.getContent())
                .build();
    }
}
