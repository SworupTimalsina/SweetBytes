package model;


public class ForgotPwdModel {
    private String username, squestion, answer, npassword;
    
    public ForgotPwdModel (String username, String squestion, String answer, String npassword) {
        
        this.username=username;
        this.squestion=squestion;
        this.answer=answer;
        this.npassword=npassword;
    }

    public ForgotPwdModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSquestion() {
        return squestion;
    }

    public void setSquestion(String squestion) {
        this.squestion = squestion;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getNpassword() {
        return npassword;
    }

    public void setNpassword(String npassword) {
        this.npassword = npassword;
    }
}
