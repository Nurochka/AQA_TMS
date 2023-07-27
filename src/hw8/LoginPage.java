package hw8;
/*Создать класс, в котором будет статический метод.
        Этот метод принимает на вход три параметра:
        Login, Password, confirmPassword.
        Все поля имеют тип данных String.
        Длина login должна быть меньше 20 символов и не должен содержать
        пробелы.
        Если login не соответствует этим требованиям, необходимо выбросить
        WrongLoginException.
        Длина password должна быть меньше 20 символов, не должен
        содержать пробелом и должен содержать хотя бы одну цифру.
        Также password и confirmPassword должны быть равны.
        Если password не соответствует этим требованиям, необходимо
        выбросить WrongPasswordException.
        WrongPasswordException и WrongLoginException - пользовательские
        классы исключения с двумя конструкторами – один по умолчанию,
        второй принимает сообщение исключения и передает его в конструктор
        класса Exception.
        Метод возвращает true, если значения верны или false в другом случае.*/


public class LoginPage {

    public static boolean validation(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean result = false;

        boolean hasDigits = false;
        for (int i = 0; i < password.length() && !hasDigits; i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigits = true;
            }
        }
        if ((login.length() < 20) && (login.length() > 0) && (login.indexOf('\u0020') == -1)
                & (password.length() < 20) && (password.length() > 0) && (password.indexOf('\u0020') != -1) && (hasDigits = true) & password.equals(confirmPassword)) {
            result = true;
        } else if ((login.length() >= 20) || (login.indexOf('\u0020') != -1)) {
            throw new WrongLoginException("Invalid login!");
        } else if ((password.length() >= 20) || (password.indexOf('\u0020') == -1) || !hasDigits || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password!");
        }
        return result;
    }
}
