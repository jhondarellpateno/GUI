package config;

public class UserSession {

    private static UserSession instance;

    private static int u_id;
    private static String u_name;
    private static String u_email;
    private static String u_status;
    private static String u_type;

    private UserSession() {
    }

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public static int getU_id() {
        return u_id;
    }

    public static void setU_id(int u_id) {
        UserSession.u_id = u_id;
    }

    public static String getU_name() {
        return u_name;
    }

    public static void setU_name(String u_name) {
        UserSession.u_name = u_name;
    }

    public static String getU_email() {
        return u_email;
    }

    public static void setU_email(String u_email) {
        UserSession.u_email = u_email;
    }

    public static String getU_status() {
        return u_status;
    }

    public static void setU_status(String u_status) {
        UserSession.u_status = u_status;
    }

    public static String getU_type() {
        return u_type;
    }

    public static void setU_type(String u_type) {
        UserSession.u_type = u_type;
    }

}
