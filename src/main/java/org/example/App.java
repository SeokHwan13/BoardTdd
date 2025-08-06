package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    List<Board> boards = new ArrayList<>();
    int finalNum = 0;


    public void run() {
        System.out.println("== 게시판 앱 ==");
        while(true){
            System.out.print("명령) ");
            Rq rq = new Rq(scanner.nextLine());
            String actionName = rq.getActionName();

            if(actionName.equals("exit")){
                System.out.print("종료 합니다...");
                break;
            }

            if(actionName.equals("write")) {
                System.out.print("제목 : ");
                String title = scanner.nextLine();
                System.out.print("내용 : ");
                String content = scanner.nextLine();

                boards.add(new Board().NewBoard(finalNum, title, content));
                System.out.printf("%s번 게시물이 등록되었습니다.\n",finalNum);
                finalNum++;
            }

            if(actionName.equals("list")) {
                System.out.println("번호 | 제목 | 등록일");
                boards.forEach(e -> System.out.printf("%d | %s | %s\n",e.getId(),e.getTitle(),e.getRegDate()));
            }

            if(actionName.equals("detail")) {
                int parm = Integer.parseInt(rq.getParam());
                Board board = boards.stream().filter(e -> e.getId() == parm).findFirst().orElse(null);
                if(board == null){System.out.println("없는 게시물 입니다.");continue;}
                System.out.printf("번호 : %d\n",parm);
                System.out.printf("제목 : %s\n",board.getTitle());
                System.out.printf("내용 : %s\n",board.getContent());
                System.out.printf("등록일 : %s\n",board.getRegDate());
            }

            if(actionName.equals("update")) {
                int parm = Integer.parseInt(rq.getParam());
                Board board = boards.stream().filter(e -> e.getId() == parm).findFirst().orElse(null);
                if(board == null){System.out.println("없는 게시물 입니다.");continue;}
                System.out.printf("제목 (현재: %s): ",board.getTitle());
                String title = scanner.nextLine();
                System.out.printf("내용 (현재: %s): ",board.getContent());
                String content = scanner.nextLine();

                board.setTitle(title);
                board.setContent(content);
                board.setModDate();

                System.out.println("=> 게시글이 수정되었습니다.");
            }
        }
    }
}
