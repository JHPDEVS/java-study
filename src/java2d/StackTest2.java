/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2d;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author 박주형
 */
public class StackTest2 {
    
    public static void main(String[] args) {
        String str = "apple banana carrort pineapple grape mango strawberry watermelon melon orange coconut kiwi lemon tomato cherry blueberry peach cramberry";
        String[] splited = str.split(" ");
        String s = str.substring(0, "apple".length());
        // 공백문자를 기준으로 하나씩 짤라 주세요
        // 구분자를 입력으로 주고 , 그 구분자로 구분되는
        // 문자열들을 하나씩, 하나씩 뽑아 쓸 수 있게 해주는
        // java.util 패키지의 클래스가 뭐냐 하면
        // StringTokennizer
        for(int i=0; i<splited.length;i++) {
            System.out.print(splited[i] + " ");
        }
        
        StringTokenizer st = new StringTokenizer(str,"");
       // String s2 = st.nextToken();
       // System.out.println(s2);
        
        System.out.println("token 수 : " + st.countTokens());
        // 토큰을 다 찍어 보는 방법1
        // 토큰의 수 만큼 for 문 돌기...
        
        // 토큰을 다 찍어 보는 방법2
        // 아직 나에게 줄 토큰이 남아있는지 물어보고
        // 있으면 nextToken() 메소드를 호출해서 하나씩 받아서 사용하기
        // 주로 2번째 방법을 많이 사용 6과부터 시험 10문제정도
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
