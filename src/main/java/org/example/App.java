package org.example;

import org.example.Global;

public class App {
   public void run (){
       System.out.println("====== 보드게임 추천 게시판 ======");
       System.out.println("로그인 / 회원가입 / 게시판 / 리뷰 / 좋아요");

       while (true) {
           System.out.print("명령어 : ");
           String command = Global.getScanner().nextLine().trim();

           switch (command) {

               case "로그인":

               case "로그아웃":

               case "회원가입":

               case "게시글 작성":

               case "게시글 수정":

               case "게시글 삭제":

               case "게시글 목록":

               case "리뷰 작성":

               case "리뷰 수정":

               case "리뷰 삭제":

               case "리뷰 목록":

               case "좋아요":

               case "좋아요 취소":

           }

       }

   }
}
