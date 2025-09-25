package com.example.hakaton;
/*      ^^^^^^^^^^^^
 * ПОМЕНЯТЬ НАЗВАНИЕ ПАКЕТА.
 * ПОМЕНЯТЬ НАЗВАНИЕ ПАКЕТА.
 * ПОМЕНЯТЬ НАЗВАНИЕ ПАКЕТА.
 */
import java.sql.*;

public class sqlManager {


    // Обязательные данные. Не подлежат изменениям.
    private Statement statement;
    private Connection connection;

    private String username = "studio";
    private String password = "kasgdkjahgdja";
    private String jdbc_connect_line = "jdbc:mysql://185.143.238.18.:3306/project";
    // Конец обязательных данных.

    // автоматически созданный конструктор класса, инициализация базы данных.
    public sqlManager(){
        try{
            connection = DriverManager.getConnection(jdbc_connect_line, username, password);
            statement = connection.createStatement();
            System.out.println("DataBase is connected.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    // сброс соединения, создание нового. В случае, если база данных перестала отвечать на запросы.
    public void resetConnection(){
        try {
            connection = DriverManager.getConnection(jdbc_connect_line, username, password);
            statement = connection.createStatement();
            return;
        }catch (Exception e){
            return;
        }
    }


    // проверка доступности статмента.
    public boolean isStatmentAviable(){
        try {
            return !(statement.isClosed());
        }catch (Exception e){
            return true;
        }
    }


    // проверка наличия пользователя в базе данных.
    public boolean isUserRegistred(String email){
        try {
            if(!statement.executeQuery("SELECT * FROM `users` WHERE `email` = '"+ email +"'").next()) return false;
            return true;
        }catch (Exception e){
            return false;
        }
    }

    // получить имя пользователя с базы данных.
    public String getUserName(int userId) {
        try {
            if (!statement.executeQuery("SELECT * FROM `users` WHERE `id` = '" + userId + "'").isBeforeFirst()) {
                return "no in DataBase";
            }
            ResultSet s = statement.executeQuery("SELECT * FROM `users` WHERE `id` = '" + userId + "'");
            s.next();
            return s.getString("name");
        } catch (Exception e) {
            return e.getMessage();
        }

    }

    // Получение фамилии с базы данных по ID пользователя.
    public String getUserSurname(int userId){
        try {
            if (!statement.executeQuery("SELECT * FROM `users` WHERE `id` = '" + userId + "'").isBeforeFirst()) {
                return "no in DataBase";
            }
            ResultSet s = statement.executeQuery("SELECT * FROM `users` WHERE `id` = '" + userId + "'");
            s.next();
            return s.getString("surname");
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // Получения ID пользователя по Email.
    public int getUserIdByEmail(String email) {
        try {
            if (!statement.executeQuery("SELECT * FROM `users` WHERE `email` = '" + email.toLowerCase() + "'").isBeforeFirst()) {
                return -1;
            }
            ResultSet s = statement.executeQuery("SELECT * FROM `users` WHERE `email` = '" + email.toLowerCase() + "'");
            s.next();
            return s.getInt("id");
        } catch (Exception e){
            e.getStackTrace();
            return -1;
        }
    }

    public String getUserFullInfo(int userId){
        try {
            if (!statement.executeQuery("SELECT * FROM `users` WHERE `id` = '" + userId + "'").isBeforeFirst()) {
                return "no in DataBase";
            }
            ResultSet s = statement.executeQuery("SELECT * FROM `users` WHERE `id` = '" + userId + "'");
            s.next();
            return s.getString("name") + " " + s.getString("surname");
        } catch (Exception e) {
            return e.getMessage();
        }
    }


    //Прямая фунция, чтобы создать пользователя в БД.
    public void createNewUser(String email, String password, String name, String surname){
        try {
            statement.execute("INSERT INTO `users`(`email`, `password`, `name`, `surname`) VALUES ('"+email.toLowerCase().trim()+"', MD5('"+password+"'), '"+name+"', '"+surname+"')");
        }catch (Exception e){
            e.getStackTrace();
        }
    }


    // Функция для проверки точности данных, которые ввёл пользователь. Используется для реализации логин функции. Вернёт ложное значение при случаях: пользователя нет в БД, не верный пароль. Истинное, если пароль введён точно и пользователь есть в БД.
    public boolean isCorrectLoginData(String email, String password){
        try {
            if (!statement.executeQuery("SELECT * FROM `users` WHERE `email` = '" + email + "'").isBeforeFirst() || !statement.executeQuery("SELECT * FROM `users` WHERE `email` = '" + email + "' AND `password` = MD5('"+password+"')").isBeforeFirst()) {
                return false;
            }
            return true;
        }catch (Exception e){
            e.getStackTrace();
            return false;
        }
    }

    //Функция, отправляющая код восстановления на почту. В случае, если код был получен ранее, либо почта не является действительной(не является субъектом базы данных) - вернёт ложное значение. Вернёт истинное значение, если удалось отправить код на почту.
    public boolean sendRecoveryByEmail(String email){
        //no available
        return false;
    }

    // Функция для получения кода с почты. В случае, если на почту нет активных кодов, вернёт значение -1, а если для почты имеется код, то вернёт значение кода с БД для почты.
    public int getRecoveryCodeByEmail(String email){
        // no available.
        return -1;
    }
}