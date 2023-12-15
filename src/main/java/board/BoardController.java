package board;

import org.example.Global;

public class BoardController {

    BorderService borderService;

    public BorderService () {
        borderService = new BorderService();
    }

    public void creat () {

        System.out.println("보드게임 이름을 입력해주세요.");
        System.out.print("입력 : ");
        String title = Global.getScanner().nextLine();

        System.out.println("게임 난이도를 입력 해주세요.");
        System.out.println("난이도 : ");
        String level = Global.getScanner().nextLine();

        System.out.println("플레이어 수를 입력 해주세요.");
        System.out.println("추천 플레이어수(명) : ");
        int count = Integer.getInteger(Global.getScanner().nextLine());

        System.out.println("플레이 타임을 입력해주세요.");
        System.out.println("플레이 타임(분) : ");
        int time = Integer.getInteger(Global.getScanner().nextLine());

    }

    public void delete () {

        System.out.println("삭제할 게시물 번호를 입력하세요.");


    }

    public  void update () {

    }

    public void list () {

    }


}
