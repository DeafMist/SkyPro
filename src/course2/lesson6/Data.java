package course2.lesson6;

public class Data {
    private static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

    private Data() {}

    public static boolean checkParams(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!check(login)) {
            throw new WrongLoginException("Некорректный логин");
        }

        if (!check(password)) {
            throw new WrongPasswordException("Некорректный пароль");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }

        return true;
    }

    private static boolean check(String arg) {
        if (arg == null || arg.isBlank() || arg.isEmpty() || arg.length() > 20) {
            return false;
        }

        for (int i = 0; i < arg.length(); i++) {
            if (!alphabet.contains(Character.toString(arg.charAt(i)))) {
                return false;
            }
        }

        return true;
    }
}
