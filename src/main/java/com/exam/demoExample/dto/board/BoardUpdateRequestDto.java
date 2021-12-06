//package com.exam.demoExample.dto.board;
//
//import com.exam.demoExample.domain.user.User;
//import com.exam.demoExample.domain.board.Board;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@Builder
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//public class BoardUpdateRequestDto {
//
//    private String title;
//    private String content;
//    private int count;
//    private User user;
//
//    public Board toEntity() {
//        return Board.builder()
//                .title(title)
//                .content(content)
//                .count(0)
//                .user(user)
//                .build();
//    }
//
//}
