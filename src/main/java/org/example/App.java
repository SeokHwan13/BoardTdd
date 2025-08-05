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
            String cmd = scanner.nextLine();

            if(cmd.equals("exit")){
                System.out.print("종료 합니다...");
                break;
            }

            if(cmd.equals("write")) {
                System.out.print("제목 : ");
                String title = scanner.nextLine();
                System.out.print("내용 : ");
                String content = scanner.nextLine();

                boards.add(new Board().NewBoard(finalNum, title, content));
                System.out.printf("%s번 게시물이 등록되었습니다.\n",finalNum);
                finalNum++;
            }
        }
    }
}
