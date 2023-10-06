package com.nhnacademy.group.starcraft.jinwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Game {
    final String[] tribes = {"terran", "protoss", "zerg"};
    private Player user;
    private final Player computer;
    public Game() throws IOException{
        createUserTroop();
        computer = new Player(tribes[(int) (Math.random() * 3)]);
    }

    public void createUserTroop() throws IOException{
        while(true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("종족을 선택하세요 : ");
            String choose = br.readLine();
            if (Arrays.asList(tribes).contains(choose)) {
                user = new Player(choose);
                break;
            }
            System.out.println("올바른 입력 값이 아닙니다. 다시 입력하세요.");
        }
    }

    public void start(){
        System.out.println("게임 시작");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (!user.getUnits().isEmpty() && !computer.getUnits().isEmpty()) {
                status();
                System.out.print("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요 : ");
                String choose = br.readLine();
                userTurn(choose);
                comTurn();
            }
        } catch(IOException error){
            error.getStackTrace();
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

    public void userTurn(String input){
        try {
            StringTokenizer st = new StringTokenizer(input);
            int attNum = Integer.parseInt(st.nextToken());
            int getAttNum = Integer.parseInt(st.nextToken());
            Unit attUnit = user.getUnits().get(attNum);
            Unit getAttUnit = computer.getUnits().get(getAttNum);
            try {
                if (attUnit.attack(getAttUnit) == null) {
                    throw new IllegalArgumentException("공격할 수 없는 대상 입니다. 다시 지정 하세요.");
                }
                attUnit.attack(getAttUnit);
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                start();
            }
            computer.arrange();
        } catch(IndexOutOfBoundsException e){
            System.out.println("졌습니다!!");
        } catch(IllegalArgumentException | NoSuchElementException e){
            System.out.println("올바른 입력 값이 아닙니다. 다시 입력하세요.");
            start();
        }
    }

    public void comTurn(){
        try {
            boolean repeat = true;
            while(repeat) {
                int attNum = (int) (Math.random() * computer.getUnits().size());
                int getAttNum = (int) (Math.random() * user.getUnits().size());
                Unit attUnit = computer.getUnits().get(attNum);
                Unit getAttUnit = user.getUnits().get(getAttNum);
                if (attUnit.attack(getAttUnit) != null) {
                    user.arrange();
                    repeat = false;
                }
            }
        } catch(IndexOutOfBoundsException e){
            System.out.println("이겼습니다!!");
        }
    }
}
