/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2d;

import java.util.*;
/**
 *
 * @author 박주형
 */
public class GenericArray<T> {
    
    private Object[] arr;
    private int capacity = 10;
    private int size = 0;
    
    public GenericArray() {
        arr = new Object[capacity];
    }
    private void increaseCapacity() {
           capacity = capacity + capacity/2;
           Object[] tmp = new Object[capacity];
           //원래 값들을 tmp로 복사
           for(int i=0; i < size; i++) {
               tmp[i] = arr[i];
           }
           
           arr = tmp;
    }
    public void add(T value) {
        if(capacity > size) {
            arr[size++] = value;
        } else {
           increaseCapacity();
           System.out.println(capacity);
        }
        

    }
    
    public void add(int idx, T value) {
        //용량이 이미 꽉차있으면 용량을 50% 늘리고 아래 코드를 실행한다.
        if(capacity <= size) {
          increaseCapacity();
        }
        //맨 뒤에 있는 원소부터 오른쪽으로 한 칸씩 민다
        for (int i= size -1; i>=idx; i--) {
            arr[i+1] = arr[i];
        }
        // idx 자리에 value를 집어넣는다
        arr[idx] = value;
        //사이즈를 증가시켜준다
        size++;
    }
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < size-1; i++) {
            result += arr[i] + " , ";
            if((i+1)%10 ==0) {
                result += "\n";
            }
        }
        
        result += arr[size-1];
        result += "]";
        return result;
    }
    public int size() {
        return size;
    }
    public T get(int idx) {
        return (T)arr[idx];
    }
    public void remove() {
        if (size > 0 ) {
            size--;
        }
    }
    
    public void remove(int idx) {
        // 리무브 할려면 idx 숫자부터 한칸 씩 왼쪽으로 땡겨주고 size를 하나 뺀다.
        if(idx < size) {
            for (int i=idx+1; i<size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
        } else {
            System.out.println("삭제할 번호를 올바르게 입력해주세요");
        }
    }
    public static void main(String[] args) {
        GenericArray<String> list = new GenericArray<>();
        for (int i = 0; i < 100; i++) {
            list.add("String");
        }
        System.out.println(list.toString());
        
    }
}
