package com.nhnacademy.group.starcraft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Game {
    final String[] tribes = {"terran", "protoss", "zerg"};
    private final Player user;
    private final Player computer;
    public Game() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.print("종족을 선택하세요 : ");
            String choose = br.readLine();
            if (Arrays.asList(tribes).contains(choose)) {
                user = new Player(choose);
                computer = new Player(tribes[(int) (Math.random() * 3)]);
                System.out.println("게임 시작");
                break;
            }
            System.out.println("올바른 종족의 값을 입력하세요");
        }
    }

    public void start(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (!user.getUnits().isEmpty() && !computer.getUnits().isEmpty()) {
                status();
                System.out.print("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요 : ");
                String choose = br.readLine();
                userBattle(choose);
                comBattle();
            }
            System.out.println(user.getUnits().isEmpty() ? "승리했습니다!!" : "졌습니다!!");
        } catch(IllegalArgumentException | NoSuchElementException error){
            System.out.println("올바른 입력 값이 아닙니다.");
            start();
        } catch(IOException e){
            e.getStackTrace();
        }
    }

    public void status(){
        int index = 0;
        System.out.println("적군 : " + computer.getUnits().get(0).tribe);
        for (Unit unit : computer.getUnits()) {
            System.out.println(index + ". " + unit);
            index++;
        }
        index = 0;
        System.out.println("아군 : " + user.getUnits().get(0).tribe);
        for (Unit unit : user.getUnits()) {
            System.out.println(index + ". " + unit);
            index++;
        }
    }

    public void userBattle(String input){
            StringTokenizer st = new StringTokenizer(input);
            int attNum = Integer.parseInt(st.nextToken());
            int getAttNum = Integer.parseInt(st.nextToken());
            Unit attUnit = user.getUnits().get(attNum);
            Unit getAttUnit = computer.getUnits().get(getAttNum);
            computer.arrange(attUnit.attack(getAttUnit), getAttNum);
    }

    public void comBattle(){
        while(true){
            int attNum = (int) (Math.random() * computer.getUnits().size());
            int getAttNum = (int) (Math.random() * user.getUnits().size());
            Unit attUnit = computer.getUnits().get(attNum);
            Unit getAttUnit = user.getUnits().get(getAttNum);
            if(attUnit.attack(getAttUnit) != null){
                user.arrange(attUnit.attack(getAttUnit), getAttNum);
                break;
            }
        }
    }
}
