package serviceregistrationanddiscoverymail;

public class MailDataService {
    private Integer memberID;
    private Mail mail;

    public MailDataService() {

    }

    public MailDataService(Integer memberID, Mail mail) {
        this.memberID = memberID;
        this.mail = mail;
    }

    public String postMail(Integer memberId, Mail mail){
        String text = "MailDataService{" +
                "memberID=" + memberID +
                ", mail=" + mail.toString() +
                '}';
        System.out.print(text);
        return text;
    }

    public Integer getMemberID() {
        return memberID;
    }

    public void setMemberID(Integer memberID) {
        this.memberID = memberID;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "MailDataService{" +
                "memberID=" + memberID +
                ", mail=" + mail.toString() +
                '}';
    }
}
