/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.bean;

/**
 *
 * @author gagan
 */
public class Account {
    
    private int did,aid;
    private String account_id,secure_id,balance,login,cards,log_in;
    boolean valid;

    public String getLog_in() {
        return log_in;
    }

    public void setLog_in(String log_in) {
        this.log_in = log_in;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getSecure_id() {
        return secure_id;
    }

    public void setSecure_id(String secure_id) {
        this.secure_id = secure_id;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCards() {
        return cards;
    }

    public void setCards(String cards) {
        this.cards = cards;
    }
    
    
}
