package config;

public class UserSession {

    private static int u_id;
    private static String u_name;
    private static String u_email;
    private static String u_status;
    private static String u_type;
    private static String imagePath;

    public static String getImagePath() {
        return imagePath;
    }

    public static void setImagePath(String imagePath) {
        UserSession.imagePath = imagePath;
    }

    // REMOVE instance and getInstance()

    public static int getU_id() {
        return u_id;
    }

    public static void setU_id(int id) {
        u_id = id;
    }

    public static String getU_name() {
        return u_name;
    }

    public static void setU_name(String name) {
        u_name = name;
    }

    public static String getU_email() {
        return u_email;
    }

    public static void setU_email(String email) {
        u_email = email;
    }

    public static String getU_status() {
        return u_status;
    }

    public static void setU_status(String status) {
        u_status = status;
    }

    public static String getU_type() {
        return u_type;
    }

    public static void setU_type(String type) {
        u_type = type;
    }

    public static void clearSession() {
        u_id = 0;
        u_name = null;
        u_email = null;
        u_status = null;
        u_type = null;
        imagePath = null;
    }
}
