package com.likelion.springsession.comment.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class CommentUpdateRequest {

    @NotBlank(message = "댓글은 비어있을 수 없습니다. ")
    @Size(max = 500, message = "댓글은 500자 미만입니다. ")
    private String content;
}