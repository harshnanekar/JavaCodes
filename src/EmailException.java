public class EmailException extends Exception {

    EmailException(String invalid_email_id){
        super(invalid_email_id);
    }
}
