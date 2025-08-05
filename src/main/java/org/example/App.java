package org.example;

import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);
    public void run() {
        System.out.println("== 게시판 앱 ==");
        while(true){
            System.out.print("명령) ");
            String cmd = sc.nextLine();
            if(cmd.equals("exit")){
                System.out.print("종료 합니다...");
                break;
            }
        }
    }
}
