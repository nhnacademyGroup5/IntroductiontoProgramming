package ch6;

import java.util.StringTokenizer;

public class Messages {
    private String sender;
    private String receiver;
    private String message;

    public Messages(String sender, String receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public String getSender() {
        return this.sender;
    }

    public String getReciver() {
        return this.receiver;
    }

    public String getMessage() {
        return this.message;
    }

    public void eliminationSpace(){
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(this.message);

        sb.append(st.nextToken());
        while(st.hasMoreTokens()){
            sb.append(" ").append(st.nextToken());
        }

        this.message = sb.toString();
    }

    public void eliminationvowel(){
        StringBuilder sb = new StringBuilder(message);

        String alpa = message.toUpperCase();
        for(int i=message.length()-1; i>=0; i--){
            char ch = alpa.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                sb.deleteCharAt(i);
            }
        }

        this.message = sb.toString();
    }

    public void eliminationAll(){
        eliminationSpace();
        eliminationvowel();
    }
    
}
