/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2d;

/**
 *
 * @author 박주형
 */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.HashMap;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


// 네이버 기계번역 (Papago SMT) API 예제
public class papagoTranslater extends JFrame implements ActionListener {
    
    private JTextArea in, out;
    private JButton convert , cancel;

    public papagoTranslater() {
        this.setTitle("Translate");


        in = new JTextArea(10,14);
        out = new JTextArea(10,14);

        in.setLineWrap(true); // 자동 줄 바꿈
        out.setLineWrap(true); // 자동 줄 바꿈
        out.setEditable(false); // 편집 불가

        JPanel textAreaPanel = new JPanel(new GridLayout(1,2,20,20));
        textAreaPanel.add(in);
        textAreaPanel.add(out);

        convert = new JButton("변환");
        cancel = new JButton("취소");
        convert.addActionListener(this);
        cancel.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(convert);
        buttonPanel.add(cancel);

        JPanel MainPanel = new JPanel(new BorderLayout(10,10));
        MainPanel.add(textAreaPanel, BorderLayout.CENTER);
        MainPanel.add(buttonPanel,BorderLayout.SOUTH);

        this.setLayout((new FlowLayout(FlowLayout.CENTER,20,20)));
        this.add(MainPanel);
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
      @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        /* 
            변환 버튼이 클릭되었다면
            좌측 textArea (textIn)의 텍스트를 읽어서
            영어로 변환하고 그 변환된 결과를
            우측 textArea (textout) 에 append

            취소 버튼이 클릭되었다면
            우측을 빈 문자열로 설정
        */
        if(e.getSource().equals(convert)) {
            //out.append(toEnglish(in.getText()));
        String clientId = "";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "";//애플리케이션 클라이언트 시크릿값";

        String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
        String text = null;
        String str = in.getText();
            try {
                text = URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(papagoTranslater.class.getName()).log(Level.SEVERE, null, ex);
            }
                

        Map<String, String> requestHeaders = new HashMap<>();
        requestHeaders.put("X-Naver-Client-Id", clientId);
        requestHeaders.put("X-Naver-Client-Secret", clientSecret);

        String responseBody = post(apiURL, requestHeaders, text);
        System.out.println(responseBody);
        JSONParser jsonParser = new JSONParser();
            try {
                JSONObject obj = (JSONObject) jsonParser.parse(responseBody);
                JSONObject objmessage = (JSONObject) obj.get("message");
                JSONObject objresult = (JSONObject) objmessage.get("result");
                String value = (String) objresult.get("translatedText");
                out.setText(value);
                System.out.println(value);

                
            } catch (ParseException ex) {
                Logger.getLogger(papagoTranslater.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 

        if(e.getSource().equals(cancel)) {
            out.setText(" ");
        }
    }
        private String toEnglish() {
        /*
            korean 문자열을 영어로 변환해서 반환
            텍스트 >= text
            영어 => english
        */
        String result = in.getText();
        return result;
    }
    public static void main(String[] args) {

        papagoTranslater hello =new papagoTranslater();
        hello.setVisible(true);
    }

    private static String post(String apiUrl, Map<String, String> requestHeaders, String text){
        HttpURLConnection con = connect(apiUrl);
        String postParams = "source=ko&target=en&text=" + text; //원본언어: 한국어 (ko) -> 목적언어: 영어 (en)
        try {
            con.setRequestMethod("POST");
            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
                con.setRequestProperty(header.getKey(), header.getValue());
            }

            con.setDoOutput(true);
            try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
                wr.write(postParams.getBytes());
                wr.flush();
            }

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 응답
                return readBody(con.getInputStream());
            } else {  // 에러 응답
                return readBody(con.getErrorStream());
            }
        } catch (IOException e) {
            throw new RuntimeException("API 요청과 응답 실패", e);
        } finally {
            con.disconnect();
        }
    }

    private static HttpURLConnection connect(String apiUrl){
        try {
            URL url = new URL(apiUrl);
            return (HttpURLConnection)url.openConnection();
        } catch (MalformedURLException e) {
            throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
        } catch (IOException e) {
            throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
        }
    }

    private static String readBody(InputStream body){
        InputStreamReader streamReader = new InputStreamReader(body);

        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
            StringBuilder responseBody = new StringBuilder();

            String line;
            while ((line = lineReader.readLine()) != null) {
                responseBody.append(line);
            }

            return responseBody.toString();
        } catch (IOException e) {
            throw new RuntimeException("API 응답을 읽는데 실패했습니다.", e);
        }
    }
}